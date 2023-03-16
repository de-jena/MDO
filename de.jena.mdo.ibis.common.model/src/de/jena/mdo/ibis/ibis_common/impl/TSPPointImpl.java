/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;
import de.jena.mdo.ibis.ibis_common.TSPPoint;

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
 * An implementation of the model object '<em><b>TSP Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl#getTSPPointRef <em>TSP Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl#getTSPCode <em>TSP Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.TSPPointImpl#getDesciption <em>Desciption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSPPointImpl extends MinimalEObjectImpl.Container implements TSPPoint {
	/**
	 * The cached value of the '{@link #getTSPPointRef() <em>TSP Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSPPointRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN tSPPointRef;

	/**
	 * The cached value of the '{@link #getTSPCode() <em>TSP Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSPCode()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN tSPCode;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> shortName;

	/**
	 * The cached value of the '{@link #getDesciption() <em>Desciption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesciption()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> desciption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSPPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.TSP_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getTSPPointRef() {
		return tSPPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSPPointRef(IBISIPNMTOKEN newTSPPointRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldTSPPointRef = tSPPointRef;
		tSPPointRef = newTSPPointRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TSP_POINT__TSP_POINT_REF, oldTSPPointRef, newTSPPointRef);
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
	public void setTSPPointRef(IBISIPNMTOKEN newTSPPointRef) {
		if (newTSPPointRef != tSPPointRef) {
			NotificationChain msgs = null;
			if (tSPPointRef != null)
				msgs = ((InternalEObject)tSPPointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TSP_POINT__TSP_POINT_REF, null, msgs);
			if (newTSPPointRef != null)
				msgs = ((InternalEObject)newTSPPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TSP_POINT__TSP_POINT_REF, null, msgs);
			msgs = basicSetTSPPointRef(newTSPPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TSP_POINT__TSP_POINT_REF, newTSPPointRef, newTSPPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getTSPCode() {
		return tSPCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSPCode(IBISIPNMTOKEN newTSPCode, NotificationChain msgs) {
		IBISIPNMTOKEN oldTSPCode = tSPCode;
		tSPCode = newTSPCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TSP_POINT__TSP_CODE, oldTSPCode, newTSPCode);
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
	public void setTSPCode(IBISIPNMTOKEN newTSPCode) {
		if (newTSPCode != tSPCode) {
			NotificationChain msgs = null;
			if (tSPCode != null)
				msgs = ((InternalEObject)tSPCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TSP_POINT__TSP_CODE, null, msgs);
			if (newTSPCode != null)
				msgs = ((InternalEObject)newTSPCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TSP_POINT__TSP_CODE, null, msgs);
			msgs = basicSetTSPCode(newTSPCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TSP_POINT__TSP_CODE, newTSPCode, newTSPCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getShortName() {
		if (shortName == null) {
			shortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.TSP_POINT__SHORT_NAME);
		}
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getDesciption() {
		if (desciption == null) {
			desciption = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.TSP_POINT__DESCIPTION);
		}
		return desciption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.TSP_POINT__TSP_POINT_REF:
				return basicSetTSPPointRef(null, msgs);
			case IbisCommonPackage.TSP_POINT__TSP_CODE:
				return basicSetTSPCode(null, msgs);
			case IbisCommonPackage.TSP_POINT__SHORT_NAME:
				return ((InternalEList<?>)getShortName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.TSP_POINT__DESCIPTION:
				return ((InternalEList<?>)getDesciption()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.TSP_POINT__TSP_POINT_REF:
				return getTSPPointRef();
			case IbisCommonPackage.TSP_POINT__TSP_CODE:
				return getTSPCode();
			case IbisCommonPackage.TSP_POINT__SHORT_NAME:
				return getShortName();
			case IbisCommonPackage.TSP_POINT__DESCIPTION:
				return getDesciption();
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
			case IbisCommonPackage.TSP_POINT__TSP_POINT_REF:
				setTSPPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.TSP_POINT__TSP_CODE:
				setTSPCode((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.TSP_POINT__SHORT_NAME:
				getShortName().clear();
				getShortName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.TSP_POINT__DESCIPTION:
				getDesciption().clear();
				getDesciption().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.TSP_POINT__TSP_POINT_REF:
				setTSPPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.TSP_POINT__TSP_CODE:
				setTSPCode((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.TSP_POINT__SHORT_NAME:
				getShortName().clear();
				return;
			case IbisCommonPackage.TSP_POINT__DESCIPTION:
				getDesciption().clear();
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
			case IbisCommonPackage.TSP_POINT__TSP_POINT_REF:
				return tSPPointRef != null;
			case IbisCommonPackage.TSP_POINT__TSP_CODE:
				return tSPCode != null;
			case IbisCommonPackage.TSP_POINT__SHORT_NAME:
				return shortName != null && !shortName.isEmpty();
			case IbisCommonPackage.TSP_POINT__DESCIPTION:
				return desciption != null && !desciption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TSPPointImpl
