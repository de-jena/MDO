/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.BayArea;
import de.jena.mdo.ibis.ibis_common.IBISIPDouble;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl#getBeforeBay <em>Before Bay</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.BayAreaImpl#getBehindBay <em>Behind Bay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayAreaImpl extends MinimalEObjectImpl.Container implements BayArea {
	/**
	 * The cached value of the '{@link #getBeforeBay() <em>Before Bay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeBay()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble beforeBay;

	/**
	 * The cached value of the '{@link #getBehindBay() <em>Behind Bay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehindBay()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble behindBay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BayAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.BAY_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getBeforeBay() {
		return beforeBay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeBay(IBISIPDouble newBeforeBay, NotificationChain msgs) {
		IBISIPDouble oldBeforeBay = beforeBay;
		beforeBay = newBeforeBay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BAY_AREA__BEFORE_BAY, oldBeforeBay, newBeforeBay);
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
	public void setBeforeBay(IBISIPDouble newBeforeBay) {
		if (newBeforeBay != beforeBay) {
			NotificationChain msgs = null;
			if (beforeBay != null)
				msgs = ((InternalEObject)beforeBay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BAY_AREA__BEFORE_BAY, null, msgs);
			if (newBeforeBay != null)
				msgs = ((InternalEObject)newBeforeBay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BAY_AREA__BEFORE_BAY, null, msgs);
			msgs = basicSetBeforeBay(newBeforeBay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BAY_AREA__BEFORE_BAY, newBeforeBay, newBeforeBay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getBehindBay() {
		return behindBay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehindBay(IBISIPDouble newBehindBay, NotificationChain msgs) {
		IBISIPDouble oldBehindBay = behindBay;
		behindBay = newBehindBay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BAY_AREA__BEHIND_BAY, oldBehindBay, newBehindBay);
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
	public void setBehindBay(IBISIPDouble newBehindBay) {
		if (newBehindBay != behindBay) {
			NotificationChain msgs = null;
			if (behindBay != null)
				msgs = ((InternalEObject)behindBay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BAY_AREA__BEHIND_BAY, null, msgs);
			if (newBehindBay != null)
				msgs = ((InternalEObject)newBehindBay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BAY_AREA__BEHIND_BAY, null, msgs);
			msgs = basicSetBehindBay(newBehindBay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BAY_AREA__BEHIND_BAY, newBehindBay, newBehindBay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.BAY_AREA__BEFORE_BAY:
				return basicSetBeforeBay(null, msgs);
			case IbisCommonPackage.BAY_AREA__BEHIND_BAY:
				return basicSetBehindBay(null, msgs);
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
			case IbisCommonPackage.BAY_AREA__BEFORE_BAY:
				return getBeforeBay();
			case IbisCommonPackage.BAY_AREA__BEHIND_BAY:
				return getBehindBay();
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
			case IbisCommonPackage.BAY_AREA__BEFORE_BAY:
				setBeforeBay((IBISIPDouble)newValue);
				return;
			case IbisCommonPackage.BAY_AREA__BEHIND_BAY:
				setBehindBay((IBISIPDouble)newValue);
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
			case IbisCommonPackage.BAY_AREA__BEFORE_BAY:
				setBeforeBay((IBISIPDouble)null);
				return;
			case IbisCommonPackage.BAY_AREA__BEHIND_BAY:
				setBehindBay((IBISIPDouble)null);
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
			case IbisCommonPackage.BAY_AREA__BEFORE_BAY:
				return beforeBay != null;
			case IbisCommonPackage.BAY_AREA__BEHIND_BAY:
				return behindBay != null;
		}
		return super.eIsSet(featureID);
	}

} //BayAreaImpl
