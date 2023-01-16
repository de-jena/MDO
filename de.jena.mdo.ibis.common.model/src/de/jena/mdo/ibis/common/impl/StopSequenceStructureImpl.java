/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.StopInformationStructure;
import de.jena.mdo.ibis.common.StopSequenceStructure;

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
 * An implementation of the model object '<em><b>Stop Sequence Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopSequenceStructureImpl#getStopPoint <em>Stop Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopSequenceStructureImpl extends MinimalEObjectImpl.Container implements StopSequenceStructure {
	/**
	 * The cached value of the '{@link #getStopPoint() <em>Stop Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<StopInformationStructure> stopPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopSequenceStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getStopSequenceStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StopInformationStructure> getStopPoint() {
		if (stopPoint == null) {
			stopPoint = new EObjectContainmentEList<StopInformationStructure>(StopInformationStructure.class, this, IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT);
		}
		return stopPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT:
				return ((InternalEList<?>)getStopPoint()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT:
				return getStopPoint();
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
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT:
				getStopPoint().clear();
				getStopPoint().addAll((Collection<? extends StopInformationStructure>)newValue);
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
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT:
				getStopPoint().clear();
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
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE__STOP_POINT:
				return stopPoint != null && !stopPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StopSequenceStructureImpl
