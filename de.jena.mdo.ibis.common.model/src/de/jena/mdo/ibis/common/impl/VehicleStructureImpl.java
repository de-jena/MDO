/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.VehicleStructure;

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
 * An implementation of the model object '<em><b>Vehicle Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.VehicleStructureImpl#getVehicleTypeRef <em>Vehicle Type Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.VehicleStructureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleStructureImpl extends MinimalEObjectImpl.Container implements VehicleStructure {
	/**
	 * The cached value of the '{@link #getVehicleTypeRef() <em>Vehicle Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleTypeRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN vehicleTypeRef;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.VEHICLE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getVehicleTypeRef() {
		return vehicleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleTypeRef(IBISIPNMTOKEN newVehicleTypeRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldVehicleTypeRef = vehicleTypeRef;
		vehicleTypeRef = newVehicleTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF, oldVehicleTypeRef, newVehicleTypeRef);
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
	public void setVehicleTypeRef(IBISIPNMTOKEN newVehicleTypeRef) {
		if (newVehicleTypeRef != vehicleTypeRef) {
			NotificationChain msgs = null;
			if (vehicleTypeRef != null)
				msgs = ((InternalEObject)vehicleTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF, null, msgs);
			if (newVehicleTypeRef != null)
				msgs = ((InternalEObject)newVehicleTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF, null, msgs);
			msgs = basicSetVehicleTypeRef(newVehicleTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF, newVehicleTypeRef, newVehicleTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.VEHICLE_STRUCTURE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF:
				return basicSetVehicleTypeRef(null, msgs);
			case IbisCommonPackage.VEHICLE_STRUCTURE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF:
				return getVehicleTypeRef();
			case IbisCommonPackage.VEHICLE_STRUCTURE__NAME:
				return getName();
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
			case IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF:
				setVehicleTypeRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.VEHICLE_STRUCTURE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF:
				setVehicleTypeRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.VEHICLE_STRUCTURE__NAME:
				getName().clear();
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
			case IbisCommonPackage.VEHICLE_STRUCTURE__VEHICLE_TYPE_REF:
				return vehicleTypeRef != null;
			case IbisCommonPackage.VEHICLE_STRUCTURE__NAME:
				return name != null && !name.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleStructureImpl
