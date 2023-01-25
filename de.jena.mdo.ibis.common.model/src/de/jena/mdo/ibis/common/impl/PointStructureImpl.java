/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.PointStructure;
import de.jena.mdo.ibis.common.PointTypeStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointStructureImpl#getPointIndex <em>Point Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointStructureImpl#getPointType <em>Point Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointStructureImpl#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointStructureImpl extends MinimalEObjectImpl.Container implements PointStructure {
	/**
	 * The cached value of the '{@link #getPointIndex() <em>Point Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt pointIndex;

	/**
	 * The cached value of the '{@link #getPointType() <em>Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointType()
	 * @generated
	 * @ordered
	 */
	protected PointTypeStructure pointType;

	/**
	 * The cached value of the '{@link #getDistanceToPreviousPoint() <em>Distance To Previous Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceToPreviousPoint()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt distanceToPreviousPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.POINT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getPointIndex() {
		return pointIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointIndex(IBISIPInt newPointIndex, NotificationChain msgs) {
		IBISIPInt oldPointIndex = pointIndex;
		pointIndex = newPointIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX, oldPointIndex, newPointIndex);
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
	public void setPointIndex(IBISIPInt newPointIndex) {
		if (newPointIndex != pointIndex) {
			NotificationChain msgs = null;
			if (pointIndex != null)
				msgs = ((InternalEObject)pointIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX, null, msgs);
			if (newPointIndex != null)
				msgs = ((InternalEObject)newPointIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX, null, msgs);
			msgs = basicSetPointIndex(newPointIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX, newPointIndex, newPointIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointTypeStructure getPointType() {
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointType(PointTypeStructure newPointType, NotificationChain msgs) {
		PointTypeStructure oldPointType = pointType;
		pointType = newPointType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE, oldPointType, newPointType);
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
	public void setPointType(PointTypeStructure newPointType) {
		if (newPointType != pointType) {
			NotificationChain msgs = null;
			if (pointType != null)
				msgs = ((InternalEObject)pointType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE, null, msgs);
			if (newPointType != null)
				msgs = ((InternalEObject)newPointType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE, null, msgs);
			msgs = basicSetPointType(newPointType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE, newPointType, newPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getDistanceToPreviousPoint() {
		return distanceToPreviousPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceToPreviousPoint(IBISIPInt newDistanceToPreviousPoint, NotificationChain msgs) {
		IBISIPInt oldDistanceToPreviousPoint = distanceToPreviousPoint;
		distanceToPreviousPoint = newDistanceToPreviousPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, oldDistanceToPreviousPoint, newDistanceToPreviousPoint);
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
	public void setDistanceToPreviousPoint(IBISIPInt newDistanceToPreviousPoint) {
		if (newDistanceToPreviousPoint != distanceToPreviousPoint) {
			NotificationChain msgs = null;
			if (distanceToPreviousPoint != null)
				msgs = ((InternalEObject)distanceToPreviousPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, null, msgs);
			if (newDistanceToPreviousPoint != null)
				msgs = ((InternalEObject)newDistanceToPreviousPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, null, msgs);
			msgs = basicSetDistanceToPreviousPoint(newDistanceToPreviousPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT, newDistanceToPreviousPoint, newDistanceToPreviousPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX:
				return basicSetPointIndex(null, msgs);
			case IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE:
				return basicSetPointType(null, msgs);
			case IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
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
			case IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX:
				return getPointIndex();
			case IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE:
				return getPointType();
			case IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
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
			case IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX:
				setPointIndex((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE:
				setPointType((PointTypeStructure)newValue);
				return;
			case IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				setDistanceToPreviousPoint((IBISIPInt)newValue);
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
			case IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX:
				setPointIndex((IBISIPInt)null);
				return;
			case IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE:
				setPointType((PointTypeStructure)null);
				return;
			case IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				setDistanceToPreviousPoint((IBISIPInt)null);
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
			case IbisCommonPackage.POINT_STRUCTURE__POINT_INDEX:
				return pointIndex != null;
			case IbisCommonPackage.POINT_STRUCTURE__POINT_TYPE:
				return pointType != null;
			case IbisCommonPackage.POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT:
				return distanceToPreviousPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //PointStructureImpl
