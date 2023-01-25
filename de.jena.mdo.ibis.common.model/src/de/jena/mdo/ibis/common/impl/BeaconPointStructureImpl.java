/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.BeaconPointStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;

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
 * An implementation of the model object '<em><b>Beacon Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl#getBeaconCode <em>Beacon Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.BeaconPointStructureImpl#getDesciption <em>Desciption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeaconPointStructureImpl extends MinimalEObjectImpl.Container implements BeaconPointStructure {
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
	 * The cached value of the '{@link #getBeaconCode() <em>Beacon Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeaconCode()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN beaconCode;

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
	protected BeaconPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.BEACON_POINT_STRUCTURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF, oldPointRef, newPointRef);
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
				msgs = ((InternalEObject)pointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF, null, msgs);
			if (newPointRef != null)
				msgs = ((InternalEObject)newPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF, null, msgs);
			msgs = basicSetPointRef(newPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF, newPointRef, newPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getBeaconCode() {
		return beaconCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeaconCode(IBISIPNMTOKEN newBeaconCode, NotificationChain msgs) {
		IBISIPNMTOKEN oldBeaconCode = beaconCode;
		beaconCode = newBeaconCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE, oldBeaconCode, newBeaconCode);
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
	public void setBeaconCode(IBISIPNMTOKEN newBeaconCode) {
		if (newBeaconCode != beaconCode) {
			NotificationChain msgs = null;
			if (beaconCode != null)
				msgs = ((InternalEObject)beaconCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE, null, msgs);
			if (newBeaconCode != null)
				msgs = ((InternalEObject)newBeaconCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE, null, msgs);
			msgs = basicSetBeaconCode(newBeaconCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE, newBeaconCode, newBeaconCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getShortName() {
		if (shortName == null) {
			shortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME);
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
			desciption = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION);
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
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF:
				return basicSetPointRef(null, msgs);
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE:
				return basicSetBeaconCode(null, msgs);
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME:
				return ((InternalEList<?>)getShortName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION:
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
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF:
				return getPointRef();
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE:
				return getBeaconCode();
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME:
				return getShortName();
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION:
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
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE:
				setBeaconCode((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME:
				getShortName().clear();
				getShortName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION:
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
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE:
				setBeaconCode((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME:
				getShortName().clear();
				return;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION:
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
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__POINT_REF:
				return pointRef != null;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__BEACON_CODE:
				return beaconCode != null;
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__SHORT_NAME:
				return shortName != null && !shortName.isEmpty();
			case IbisCommonPackage.BEACON_POINT_STRUCTURE__DESCIPTION:
				return desciption != null && !desciption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BeaconPointStructureImpl
