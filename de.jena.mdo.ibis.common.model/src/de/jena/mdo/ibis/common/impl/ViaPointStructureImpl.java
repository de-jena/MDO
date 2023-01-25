/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.ViaPointStructure;

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
 * An implementation of the model object '<em><b>Via Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl#getViaPointRef <em>Via Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl#getPlaceRef <em>Place Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl#getPlaceName <em>Place Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl#getPlaceShortName <em>Place Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ViaPointStructureImpl#getViaPointDisplayPriority <em>Via Point Display Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViaPointStructureImpl extends MinimalEObjectImpl.Container implements ViaPointStructure {
	/**
	 * The cached value of the '{@link #getViaPointRef() <em>Via Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaPointRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN viaPointRef;

	/**
	 * The cached value of the '{@link #getPlaceRef() <em>Place Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN placeRef;

	/**
	 * The cached value of the '{@link #getPlaceName() <em>Place Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> placeName;

	/**
	 * The cached value of the '{@link #getPlaceShortName() <em>Place Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> placeShortName;

	/**
	 * The cached value of the '{@link #getViaPointDisplayPriority() <em>Via Point Display Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaPointDisplayPriority()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt viaPointDisplayPriority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViaPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.VIA_POINT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getViaPointRef() {
		return viaPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViaPointRef(IBISIPNMTOKEN newViaPointRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldViaPointRef = viaPointRef;
		viaPointRef = newViaPointRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF, oldViaPointRef, newViaPointRef);
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
	public void setViaPointRef(IBISIPNMTOKEN newViaPointRef) {
		if (newViaPointRef != viaPointRef) {
			NotificationChain msgs = null;
			if (viaPointRef != null)
				msgs = ((InternalEObject)viaPointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF, null, msgs);
			if (newViaPointRef != null)
				msgs = ((InternalEObject)newViaPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF, null, msgs);
			msgs = basicSetViaPointRef(newViaPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF, newViaPointRef, newViaPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getPlaceRef() {
		return placeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlaceRef(IBISIPNMTOKEN newPlaceRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldPlaceRef = placeRef;
		placeRef = newPlaceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF, oldPlaceRef, newPlaceRef);
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
	public void setPlaceRef(IBISIPNMTOKEN newPlaceRef) {
		if (newPlaceRef != placeRef) {
			NotificationChain msgs = null;
			if (placeRef != null)
				msgs = ((InternalEObject)placeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF, null, msgs);
			if (newPlaceRef != null)
				msgs = ((InternalEObject)newPlaceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF, null, msgs);
			msgs = basicSetPlaceRef(newPlaceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF, newPlaceRef, newPlaceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getPlaceName() {
		if (placeName == null) {
			placeName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME);
		}
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getPlaceShortName() {
		if (placeShortName == null) {
			placeShortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME);
		}
		return placeShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getViaPointDisplayPriority() {
		return viaPointDisplayPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViaPointDisplayPriority(IBISIPInt newViaPointDisplayPriority, NotificationChain msgs) {
		IBISIPInt oldViaPointDisplayPriority = viaPointDisplayPriority;
		viaPointDisplayPriority = newViaPointDisplayPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY, oldViaPointDisplayPriority, newViaPointDisplayPriority);
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
	public void setViaPointDisplayPriority(IBISIPInt newViaPointDisplayPriority) {
		if (newViaPointDisplayPriority != viaPointDisplayPriority) {
			NotificationChain msgs = null;
			if (viaPointDisplayPriority != null)
				msgs = ((InternalEObject)viaPointDisplayPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY, null, msgs);
			if (newViaPointDisplayPriority != null)
				msgs = ((InternalEObject)newViaPointDisplayPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY, null, msgs);
			msgs = basicSetViaPointDisplayPriority(newViaPointDisplayPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY, newViaPointDisplayPriority, newViaPointDisplayPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF:
				return basicSetViaPointRef(null, msgs);
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF:
				return basicSetPlaceRef(null, msgs);
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME:
				return ((InternalEList<?>)getPlaceName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME:
				return ((InternalEList<?>)getPlaceShortName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY:
				return basicSetViaPointDisplayPriority(null, msgs);
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
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF:
				return getViaPointRef();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF:
				return getPlaceRef();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME:
				return getPlaceName();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME:
				return getPlaceShortName();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY:
				return getViaPointDisplayPriority();
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
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF:
				setViaPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF:
				setPlaceRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME:
				getPlaceName().clear();
				getPlaceName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME:
				getPlaceShortName().clear();
				getPlaceShortName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY:
				setViaPointDisplayPriority((IBISIPInt)newValue);
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
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF:
				setViaPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF:
				setPlaceRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME:
				getPlaceName().clear();
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME:
				getPlaceShortName().clear();
				return;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY:
				setViaPointDisplayPriority((IBISIPInt)null);
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
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_REF:
				return viaPointRef != null;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_REF:
				return placeRef != null;
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_NAME:
				return placeName != null && !placeName.isEmpty();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__PLACE_SHORT_NAME:
				return placeShortName != null && !placeShortName.isEmpty();
			case IbisCommonPackage.VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY:
				return viaPointDisplayPriority != null;
		}
		return super.eIsSet(featureID);
	}

} //ViaPointStructureImpl
