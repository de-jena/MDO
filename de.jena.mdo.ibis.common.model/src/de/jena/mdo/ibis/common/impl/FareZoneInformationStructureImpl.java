/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.FareZoneInformationStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.ZoneType;

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
 * An implementation of the model object '<em><b>Fare Zone Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl#getFareZoneID <em>Fare Zone ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl#getFareZoneType <em>Fare Zone Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl#getFareZoneLongName <em>Fare Zone Long Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.FareZoneInformationStructureImpl#getFareZoneShortName <em>Fare Zone Short Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FareZoneInformationStructureImpl extends MinimalEObjectImpl.Container implements FareZoneInformationStructure {
	/**
	 * The cached value of the '{@link #getFareZoneID() <em>Fare Zone ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN fareZoneID;

	/**
	 * The cached value of the '{@link #getFareZoneType() <em>Fare Zone Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneType()
	 * @generated
	 * @ordered
	 */
	protected ZoneType fareZoneType;

	/**
	 * The cached value of the '{@link #getFareZoneLongName() <em>Fare Zone Long Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneLongName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> fareZoneLongName;

	/**
	 * The cached value of the '{@link #getFareZoneShortName() <em>Fare Zone Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> fareZoneShortName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareZoneInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.FARE_ZONE_INFORMATION_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getFareZoneID() {
		return fareZoneID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareZoneID(IBISIPNMTOKEN newFareZoneID, NotificationChain msgs) {
		IBISIPNMTOKEN oldFareZoneID = fareZoneID;
		fareZoneID = newFareZoneID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID, oldFareZoneID, newFareZoneID);
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
	public void setFareZoneID(IBISIPNMTOKEN newFareZoneID) {
		if (newFareZoneID != fareZoneID) {
			NotificationChain msgs = null;
			if (fareZoneID != null)
				msgs = ((InternalEObject)fareZoneID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID, null, msgs);
			if (newFareZoneID != null)
				msgs = ((InternalEObject)newFareZoneID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID, null, msgs);
			msgs = basicSetFareZoneID(newFareZoneID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID, newFareZoneID, newFareZoneID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneType getFareZoneType() {
		return fareZoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareZoneType(ZoneType newFareZoneType, NotificationChain msgs) {
		ZoneType oldFareZoneType = fareZoneType;
		fareZoneType = newFareZoneType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE, oldFareZoneType, newFareZoneType);
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
	public void setFareZoneType(ZoneType newFareZoneType) {
		if (newFareZoneType != fareZoneType) {
			NotificationChain msgs = null;
			if (fareZoneType != null)
				msgs = ((InternalEObject)fareZoneType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE, null, msgs);
			if (newFareZoneType != null)
				msgs = ((InternalEObject)newFareZoneType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE, null, msgs);
			msgs = basicSetFareZoneType(newFareZoneType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE, newFareZoneType, newFareZoneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getFareZoneLongName() {
		if (fareZoneLongName == null) {
			fareZoneLongName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME);
		}
		return fareZoneLongName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getFareZoneShortName() {
		if (fareZoneShortName == null) {
			fareZoneShortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME);
		}
		return fareZoneShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID:
				return basicSetFareZoneID(null, msgs);
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE:
				return basicSetFareZoneType(null, msgs);
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME:
				return ((InternalEList<?>)getFareZoneLongName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME:
				return ((InternalEList<?>)getFareZoneShortName()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID:
				return getFareZoneID();
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE:
				return getFareZoneType();
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME:
				return getFareZoneLongName();
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME:
				return getFareZoneShortName();
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
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID:
				setFareZoneID((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE:
				setFareZoneType((ZoneType)newValue);
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME:
				getFareZoneLongName().clear();
				getFareZoneLongName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME:
				getFareZoneShortName().clear();
				getFareZoneShortName().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID:
				setFareZoneID((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE:
				setFareZoneType((ZoneType)null);
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME:
				getFareZoneLongName().clear();
				return;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME:
				getFareZoneShortName().clear();
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
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID:
				return fareZoneID != null;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE:
				return fareZoneType != null;
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME:
				return fareZoneLongName != null && !fareZoneLongName.isEmpty();
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME:
				return fareZoneShortName != null && !fareZoneShortName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FareZoneInformationStructureImpl
