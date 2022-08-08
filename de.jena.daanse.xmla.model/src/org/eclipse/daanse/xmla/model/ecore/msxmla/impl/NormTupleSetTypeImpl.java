/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla.impl;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType;
import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;
import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType;
import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Tuple Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl#getNormTuples <em>Norm Tuples</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl#getMembersLookup <em>Members Lookup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormTupleSetTypeImpl extends MinimalEObjectImpl.Container implements NormTupleSetType {
	/**
	 * The cached value of the '{@link #getNormTuples() <em>Norm Tuples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormTuples()
	 * @generated
	 * @ordered
	 */
	protected NormTuplesType normTuples;

	/**
	 * The cached value of the '{@link #getMembersLookup() <em>Members Lookup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersLookup()
	 * @generated
	 * @ordered
	 */
	protected MembersLookupType membersLookup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormTupleSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsxmlaPackage.Literals.NORM_TUPLE_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormTuplesType getNormTuples() {
		return normTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormTuples(NormTuplesType newNormTuples, NotificationChain msgs) {
		NormTuplesType oldNormTuples = normTuples;
		normTuples = newNormTuples;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES, oldNormTuples, newNormTuples);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormTuples(NormTuplesType newNormTuples) {
		if (newNormTuples != normTuples) {
			NotificationChain msgs = null;
			if (normTuples != null)
				msgs = ((InternalEObject)normTuples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES, null, msgs);
			if (newNormTuples != null)
				msgs = ((InternalEObject)newNormTuples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES, null, msgs);
			msgs = basicSetNormTuples(newNormTuples, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES, newNormTuples, newNormTuples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersLookupType getMembersLookup() {
		return membersLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembersLookup(MembersLookupType newMembersLookup, NotificationChain msgs) {
		MembersLookupType oldMembersLookup = membersLookup;
		membersLookup = newMembersLookup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP, oldMembersLookup, newMembersLookup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembersLookup(MembersLookupType newMembersLookup) {
		if (newMembersLookup != membersLookup) {
			NotificationChain msgs = null;
			if (membersLookup != null)
				msgs = ((InternalEObject)membersLookup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP, null, msgs);
			if (newMembersLookup != null)
				msgs = ((InternalEObject)newMembersLookup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP, null, msgs);
			msgs = basicSetMembersLookup(newMembersLookup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP, newMembersLookup, newMembersLookup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES:
				return basicSetNormTuples(null, msgs);
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP:
				return basicSetMembersLookup(null, msgs);
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
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES:
				return getNormTuples();
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP:
				return getMembersLookup();
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
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES:
				setNormTuples((NormTuplesType)newValue);
				return;
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP:
				setMembersLookup((MembersLookupType)newValue);
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
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES:
				setNormTuples((NormTuplesType)null);
				return;
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP:
				setMembersLookup((MembersLookupType)null);
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
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__NORM_TUPLES:
				return normTuples != null;
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP:
				return membersLookup != null;
		}
		return super.eIsSet(featureID);
	}

} //NormTupleSetTypeImpl
