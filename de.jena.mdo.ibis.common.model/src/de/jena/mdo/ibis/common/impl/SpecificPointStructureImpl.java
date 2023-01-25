/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPDouble;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.SpecificPointStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.SpecificPointStructureImpl#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificPointStructureImpl extends MinimalEObjectImpl.Container implements SpecificPointStructure {
	/**
	 * The cached value of the '{@link #getPointRef() <em>Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN pointRef;

	/**
	 * The cached value of the '{@link #getDistanceToPreviousPoint() <em>Distance To Previous Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceToPreviousPoint()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble distanceToPreviousPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SPECIFIC_POINT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getPointRef() {
		return pointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointRef(IBISIPNMTOKEN newPointRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldPointRef = pointRef;
		pointRef = newPointRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF, oldPointRef, newPointRef);
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
	public void setPointRef(IBISIPNMTOKEN newPointRef) {
		if (newPointRef != pointRef) {
			NotificationChain msgs = null;
			if (pointRef != null)
				msgs = ((InternalEObject)pointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF, null, msgs);
			if (newPointRef != null)
				msgs = ((InternalEObject)newPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF, null, msgs);
			msgs = basicSetPointRef(newPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF, newPointRef, newPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getDistanceToPreviousPoint() {
		return distanceToPreviousPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceToPreviousPoint(IBISIPDouble newDistanceToPreviousPoint, NotificationChain msgs) {
		IBISIPDouble oldDistanceToPreviousPoint = distanceToPreviousPoint;
		distanceToPreviousPoint = newDistanceToPreviousPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, oldDistanceToPreviousPoint, newDistanceToPreviousPoint);
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
	public void setDistanceToPreviousPoint(IBISIPDouble newDistanceToPreviousPoint) {
		if (newDistanceToPreviousPoint != distanceToPreviousPoint) {
			NotificationChain msgs = null;
			if (distanceToPreviousPoint != null)
				msgs = ((InternalEObject)distanceToPreviousPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, null, msgs);
			if (newDistanceToPreviousPoint != null)
				msgs = ((InternalEObject)newDistanceToPreviousPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, null, msgs);
			msgs = basicSetDistanceToPreviousPoint(newDistanceToPreviousPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, newDistanceToPreviousPoint, newDistanceToPreviousPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF:
				return basicSetPointRef(null, msgs);
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				return basicSetDistanceToPreviousPoint(null, msgs);
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
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF:
				return getPointRef();
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				return getDistanceToPreviousPoint();
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
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				setDistanceToPreviousPoint((IBISIPDouble)newValue);
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
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				setDistanceToPreviousPoint((IBISIPDouble)null);
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
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__POINT_REF:
				return pointRef != null;
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				return distanceToPreviousPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificPointStructureImpl
