/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ShortTripStopListStructure;
import de.jena.mdo.ibis.common.ShortTripStopStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Trip Stop List Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ShortTripStopListStructureImpl#getShortTripStop <em>Short Trip Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortTripStopListStructureImpl extends MinimalEObjectImpl.Container implements ShortTripStopListStructure {
	/**
	 * The cached value of the '{@link #getShortTripStop() <em>Short Trip Stop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTripStop()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortTripStopStructure> shortTripStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortTripStopListStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SHORT_TRIP_STOP_LIST_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShortTripStopStructure> getShortTripStop() {
		if (shortTripStop == null) {
			shortTripStop = new EObjectContainmentEList<ShortTripStopStructure>(ShortTripStopStructure.class, this, IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP);
		}
		return shortTripStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP:
				return ((InternalEList<?>)getShortTripStop()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP:
				return getShortTripStop();
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
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP:
				getShortTripStop().clear();
				getShortTripStop().addAll((Collection<? extends ShortTripStopStructure>)newValue);
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
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP:
				getShortTripStop().clear();
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
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP:
				return shortTripStop != null && !shortTripStop.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShortTripStopListStructureImpl
