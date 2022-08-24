/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionList;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restrictions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestrictionsImpl#getRestrictionList <em>Restriction List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionsImpl extends MinimalEObjectImpl.Container implements Restrictions {
	/**
	 * The cached value of the '{@link #getRestrictionList() <em>Restriction List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionList()
	 * @generated
	 * @ordered
	 */
	protected RestrictionList restrictionList;

	/**
	 * This is true if the Restriction List containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restrictionListESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.RESTRICTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionList getRestrictionList() {
		return restrictionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictionList(RestrictionList newRestrictionList, NotificationChain msgs) {
		RestrictionList oldRestrictionList = restrictionList;
		restrictionList = newRestrictionList;
		boolean oldRestrictionListESet = restrictionListESet;
		restrictionListESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, oldRestrictionList, newRestrictionList, !oldRestrictionListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionList(RestrictionList newRestrictionList) {
		if (newRestrictionList != restrictionList) {
			NotificationChain msgs = null;
			if (restrictionList != null)
				msgs = ((InternalEObject)restrictionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, null, msgs);
			if (newRestrictionList != null)
				msgs = ((InternalEObject)newRestrictionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, null, msgs);
			msgs = basicSetRestrictionList(newRestrictionList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRestrictionListESet = restrictionListESet;
			restrictionListESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, newRestrictionList, newRestrictionList, !oldRestrictionListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRestrictionList(NotificationChain msgs) {
		RestrictionList oldRestrictionList = restrictionList;
		restrictionList = null;
		boolean oldRestrictionListESet = restrictionListESet;
		restrictionListESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, oldRestrictionList, null, oldRestrictionListESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestrictionList() {
		if (restrictionList != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)restrictionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, null, msgs);
			msgs = basicUnsetRestrictionList(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRestrictionListESet = restrictionListESet;
			restrictionListESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.RESTRICTIONS__RESTRICTION_LIST, null, null, oldRestrictionListESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestrictionList() {
		return restrictionListESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.RESTRICTIONS__RESTRICTION_LIST:
				return basicUnsetRestrictionList(msgs);
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
			case XmlaPackage.RESTRICTIONS__RESTRICTION_LIST:
				return getRestrictionList();
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
			case XmlaPackage.RESTRICTIONS__RESTRICTION_LIST:
				setRestrictionList((RestrictionList)newValue);
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
			case XmlaPackage.RESTRICTIONS__RESTRICTION_LIST:
				unsetRestrictionList();
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
			case XmlaPackage.RESTRICTIONS__RESTRICTION_LIST:
				return isSetRestrictionList();
		}
		return super.eIsSet(featureID);
	}

} //RestrictionsImpl
