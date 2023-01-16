/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.GNSSCoordinateStructure;
import de.jena.mdo.ibis.common.IBISIPDouble;
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
 * An implementation of the model object '<em><b>GNSS Coordinate Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSCoordinateStructureImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSSCoordinateStructureImpl extends MinimalEObjectImpl.Container implements GNSSCoordinateStructure {
	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble degree;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNSSCoordinateStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getGNSSCoordinateStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegree(IBISIPDouble newDegree, NotificationChain msgs) {
		IBISIPDouble oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE, oldDegree, newDegree);
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
	public void setDegree(IBISIPDouble newDegree) {
		if (newDegree != degree) {
			NotificationChain msgs = null;
			if (degree != null)
				msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE, null, msgs);
			if (newDegree != null)
				msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE, null, msgs);
			msgs = basicSetDegree(newDegree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE, newDegree, newDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(IBISIPString newDirection, NotificationChain msgs) {
		IBISIPString oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION, oldDirection, newDirection);
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
	public void setDirection(IBISIPString newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE:
				return basicSetDegree(null, msgs);
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION:
				return basicSetDirection(null, msgs);
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
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE:
				return getDegree();
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION:
				return getDirection();
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
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE:
				setDegree((IBISIPDouble)newValue);
				return;
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION:
				setDirection((IBISIPString)newValue);
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
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE:
				setDegree((IBISIPDouble)null);
				return;
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION:
				setDirection((IBISIPString)null);
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
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DEGREE:
				return degree != null;
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE__DIRECTION:
				return direction != null;
		}
		return super.eIsSet(featureID);
	}

} //GNSSCoordinateStructureImpl
