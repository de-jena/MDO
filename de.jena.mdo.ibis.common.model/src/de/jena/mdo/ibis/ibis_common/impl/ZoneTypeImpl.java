/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;
import de.jena.mdo.ibis.ibis_common.ZoneType;

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
 * An implementation of the model object '<em><b>Zone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl#getFarezoneTypeID <em>Farezone Type ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ZoneTypeImpl#getFareZoneTypeName <em>Fare Zone Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneTypeImpl extends MinimalEObjectImpl.Container implements ZoneType {
	/**
	 * The cached value of the '{@link #getFarezoneTypeID() <em>Farezone Type ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarezoneTypeID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN farezoneTypeID;

	/**
	 * The cached value of the '{@link #getFareZoneTypeName() <em>Fare Zone Type Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneTypeName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> fareZoneTypeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.ZONE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getFarezoneTypeID() {
		return farezoneTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFarezoneTypeID(IBISIPNMTOKEN newFarezoneTypeID, NotificationChain msgs) {
		IBISIPNMTOKEN oldFarezoneTypeID = farezoneTypeID;
		farezoneTypeID = newFarezoneTypeID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID, oldFarezoneTypeID, newFarezoneTypeID);
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
	public void setFarezoneTypeID(IBISIPNMTOKEN newFarezoneTypeID) {
		if (newFarezoneTypeID != farezoneTypeID) {
			NotificationChain msgs = null;
			if (farezoneTypeID != null)
				msgs = ((InternalEObject)farezoneTypeID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID, null, msgs);
			if (newFarezoneTypeID != null)
				msgs = ((InternalEObject)newFarezoneTypeID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID, null, msgs);
			msgs = basicSetFarezoneTypeID(newFarezoneTypeID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID, newFarezoneTypeID, newFarezoneTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getFareZoneTypeName() {
		if (fareZoneTypeName == null) {
			fareZoneTypeName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME);
		}
		return fareZoneTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID:
				return basicSetFarezoneTypeID(null, msgs);
			case IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME:
				return ((InternalEList<?>)getFareZoneTypeName()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID:
				return getFarezoneTypeID();
			case IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME:
				return getFareZoneTypeName();
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
			case IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID:
				setFarezoneTypeID((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME:
				getFareZoneTypeName().clear();
				getFareZoneTypeName().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID:
				setFarezoneTypeID((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME:
				getFareZoneTypeName().clear();
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
			case IbisCommonPackage.ZONE_TYPE__FAREZONE_TYPE_ID:
				return farezoneTypeID != null;
			case IbisCommonPackage.ZONE_TYPE__FARE_ZONE_TYPE_NAME:
				return fareZoneTypeName != null && !fareZoneTypeName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneTypeImpl
