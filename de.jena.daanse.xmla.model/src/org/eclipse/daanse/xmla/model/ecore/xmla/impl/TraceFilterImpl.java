/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType;
import org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getNotEqual <em>Not Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getLess <em>Less</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getLessOrEqual <em>Less Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getGreaterOrEqual <em>Greater Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getLike <em>Like</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceFilterImpl#getNotLike <em>Not Like</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceFilterImpl extends MinimalEObjectImpl.Container implements TraceFilter {
	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected NotType not;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected AndOrType or;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected AndOrType and;

	/**
	 * The cached value of the '{@link #getEqual() <em>Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqual()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop equal;

	/**
	 * The cached value of the '{@link #getNotEqual() <em>Not Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEqual()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop notEqual;

	/**
	 * The cached value of the '{@link #getLess() <em>Less</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLess()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop less;

	/**
	 * The cached value of the '{@link #getLessOrEqual() <em>Less Or Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLessOrEqual()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop lessOrEqual;

	/**
	 * The cached value of the '{@link #getGreater() <em>Greater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreater()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop greater;

	/**
	 * The cached value of the '{@link #getGreaterOrEqual() <em>Greater Or Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreaterOrEqual()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop greaterOrEqual;

	/**
	 * The cached value of the '{@link #getLike() <em>Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLike()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop like;

	/**
	 * The cached value of the '{@link #getNotLike() <em>Not Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotLike()
	 * @generated
	 * @ordered
	 */
	protected BoolBinop notLike;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TRACE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotType getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(NotType newNot, NotificationChain msgs) {
		NotType oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT, oldNot, newNot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(NotType newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndOrType getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(AndOrType newOr, NotificationChain msgs) {
		AndOrType oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__OR, oldOr, newOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(AndOrType newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__OR, newOr, newOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndOrType getAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(AndOrType newAnd, NotificationChain msgs) {
		AndOrType oldAnd = and;
		and = newAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__AND, oldAnd, newAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(AndOrType newAnd) {
		if (newAnd != and) {
			NotificationChain msgs = null;
			if (and != null)
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__AND, newAnd, newAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getEqual() {
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEqual(BoolBinop newEqual, NotificationChain msgs) {
		BoolBinop oldEqual = equal;
		equal = newEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__EQUAL, oldEqual, newEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqual(BoolBinop newEqual) {
		if (newEqual != equal) {
			NotificationChain msgs = null;
			if (equal != null)
				msgs = ((InternalEObject)equal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__EQUAL, null, msgs);
			if (newEqual != null)
				msgs = ((InternalEObject)newEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__EQUAL, null, msgs);
			msgs = basicSetEqual(newEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__EQUAL, newEqual, newEqual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getNotEqual() {
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotEqual(BoolBinop newNotEqual, NotificationChain msgs) {
		BoolBinop oldNotEqual = notEqual;
		notEqual = newNotEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT_EQUAL, oldNotEqual, newNotEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotEqual(BoolBinop newNotEqual) {
		if (newNotEqual != notEqual) {
			NotificationChain msgs = null;
			if (notEqual != null)
				msgs = ((InternalEObject)notEqual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT_EQUAL, null, msgs);
			if (newNotEqual != null)
				msgs = ((InternalEObject)newNotEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT_EQUAL, null, msgs);
			msgs = basicSetNotEqual(newNotEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT_EQUAL, newNotEqual, newNotEqual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getLess() {
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLess(BoolBinop newLess, NotificationChain msgs) {
		BoolBinop oldLess = less;
		less = newLess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LESS, oldLess, newLess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLess(BoolBinop newLess) {
		if (newLess != less) {
			NotificationChain msgs = null;
			if (less != null)
				msgs = ((InternalEObject)less).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LESS, null, msgs);
			if (newLess != null)
				msgs = ((InternalEObject)newLess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LESS, null, msgs);
			msgs = basicSetLess(newLess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LESS, newLess, newLess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getLessOrEqual() {
		return lessOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLessOrEqual(BoolBinop newLessOrEqual, NotificationChain msgs) {
		BoolBinop oldLessOrEqual = lessOrEqual;
		lessOrEqual = newLessOrEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL, oldLessOrEqual, newLessOrEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLessOrEqual(BoolBinop newLessOrEqual) {
		if (newLessOrEqual != lessOrEqual) {
			NotificationChain msgs = null;
			if (lessOrEqual != null)
				msgs = ((InternalEObject)lessOrEqual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL, null, msgs);
			if (newLessOrEqual != null)
				msgs = ((InternalEObject)newLessOrEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL, null, msgs);
			msgs = basicSetLessOrEqual(newLessOrEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL, newLessOrEqual, newLessOrEqual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getGreater() {
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreater(BoolBinop newGreater, NotificationChain msgs) {
		BoolBinop oldGreater = greater;
		greater = newGreater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__GREATER, oldGreater, newGreater);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreater(BoolBinop newGreater) {
		if (newGreater != greater) {
			NotificationChain msgs = null;
			if (greater != null)
				msgs = ((InternalEObject)greater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__GREATER, null, msgs);
			if (newGreater != null)
				msgs = ((InternalEObject)newGreater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__GREATER, null, msgs);
			msgs = basicSetGreater(newGreater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__GREATER, newGreater, newGreater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getGreaterOrEqual() {
		return greaterOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreaterOrEqual(BoolBinop newGreaterOrEqual, NotificationChain msgs) {
		BoolBinop oldGreaterOrEqual = greaterOrEqual;
		greaterOrEqual = newGreaterOrEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL, oldGreaterOrEqual, newGreaterOrEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreaterOrEqual(BoolBinop newGreaterOrEqual) {
		if (newGreaterOrEqual != greaterOrEqual) {
			NotificationChain msgs = null;
			if (greaterOrEqual != null)
				msgs = ((InternalEObject)greaterOrEqual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL, null, msgs);
			if (newGreaterOrEqual != null)
				msgs = ((InternalEObject)newGreaterOrEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL, null, msgs);
			msgs = basicSetGreaterOrEqual(newGreaterOrEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL, newGreaterOrEqual, newGreaterOrEqual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getLike() {
		return like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLike(BoolBinop newLike, NotificationChain msgs) {
		BoolBinop oldLike = like;
		like = newLike;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LIKE, oldLike, newLike);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLike(BoolBinop newLike) {
		if (newLike != like) {
			NotificationChain msgs = null;
			if (like != null)
				msgs = ((InternalEObject)like).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LIKE, null, msgs);
			if (newLike != null)
				msgs = ((InternalEObject)newLike).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__LIKE, null, msgs);
			msgs = basicSetLike(newLike, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__LIKE, newLike, newLike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop getNotLike() {
		return notLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotLike(BoolBinop newNotLike, NotificationChain msgs) {
		BoolBinop oldNotLike = notLike;
		notLike = newNotLike;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT_LIKE, oldNotLike, newNotLike);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotLike(BoolBinop newNotLike) {
		if (newNotLike != notLike) {
			NotificationChain msgs = null;
			if (notLike != null)
				msgs = ((InternalEObject)notLike).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT_LIKE, null, msgs);
			if (newNotLike != null)
				msgs = ((InternalEObject)newNotLike).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE_FILTER__NOT_LIKE, null, msgs);
			msgs = basicSetNotLike(newNotLike, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE_FILTER__NOT_LIKE, newNotLike, newNotLike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.TRACE_FILTER__NOT:
				return basicSetNot(null, msgs);
			case XmlaPackage.TRACE_FILTER__OR:
				return basicSetOr(null, msgs);
			case XmlaPackage.TRACE_FILTER__AND:
				return basicSetAnd(null, msgs);
			case XmlaPackage.TRACE_FILTER__EQUAL:
				return basicSetEqual(null, msgs);
			case XmlaPackage.TRACE_FILTER__NOT_EQUAL:
				return basicSetNotEqual(null, msgs);
			case XmlaPackage.TRACE_FILTER__LESS:
				return basicSetLess(null, msgs);
			case XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL:
				return basicSetLessOrEqual(null, msgs);
			case XmlaPackage.TRACE_FILTER__GREATER:
				return basicSetGreater(null, msgs);
			case XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL:
				return basicSetGreaterOrEqual(null, msgs);
			case XmlaPackage.TRACE_FILTER__LIKE:
				return basicSetLike(null, msgs);
			case XmlaPackage.TRACE_FILTER__NOT_LIKE:
				return basicSetNotLike(null, msgs);
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
			case XmlaPackage.TRACE_FILTER__NOT:
				return getNot();
			case XmlaPackage.TRACE_FILTER__OR:
				return getOr();
			case XmlaPackage.TRACE_FILTER__AND:
				return getAnd();
			case XmlaPackage.TRACE_FILTER__EQUAL:
				return getEqual();
			case XmlaPackage.TRACE_FILTER__NOT_EQUAL:
				return getNotEqual();
			case XmlaPackage.TRACE_FILTER__LESS:
				return getLess();
			case XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL:
				return getLessOrEqual();
			case XmlaPackage.TRACE_FILTER__GREATER:
				return getGreater();
			case XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL:
				return getGreaterOrEqual();
			case XmlaPackage.TRACE_FILTER__LIKE:
				return getLike();
			case XmlaPackage.TRACE_FILTER__NOT_LIKE:
				return getNotLike();
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
			case XmlaPackage.TRACE_FILTER__NOT:
				setNot((NotType)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__OR:
				setOr((AndOrType)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__AND:
				setAnd((AndOrType)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__EQUAL:
				setEqual((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__NOT_EQUAL:
				setNotEqual((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__LESS:
				setLess((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL:
				setLessOrEqual((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__GREATER:
				setGreater((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL:
				setGreaterOrEqual((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__LIKE:
				setLike((BoolBinop)newValue);
				return;
			case XmlaPackage.TRACE_FILTER__NOT_LIKE:
				setNotLike((BoolBinop)newValue);
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
			case XmlaPackage.TRACE_FILTER__NOT:
				setNot((NotType)null);
				return;
			case XmlaPackage.TRACE_FILTER__OR:
				setOr((AndOrType)null);
				return;
			case XmlaPackage.TRACE_FILTER__AND:
				setAnd((AndOrType)null);
				return;
			case XmlaPackage.TRACE_FILTER__EQUAL:
				setEqual((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__NOT_EQUAL:
				setNotEqual((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__LESS:
				setLess((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL:
				setLessOrEqual((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__GREATER:
				setGreater((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL:
				setGreaterOrEqual((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__LIKE:
				setLike((BoolBinop)null);
				return;
			case XmlaPackage.TRACE_FILTER__NOT_LIKE:
				setNotLike((BoolBinop)null);
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
			case XmlaPackage.TRACE_FILTER__NOT:
				return not != null;
			case XmlaPackage.TRACE_FILTER__OR:
				return or != null;
			case XmlaPackage.TRACE_FILTER__AND:
				return and != null;
			case XmlaPackage.TRACE_FILTER__EQUAL:
				return equal != null;
			case XmlaPackage.TRACE_FILTER__NOT_EQUAL:
				return notEqual != null;
			case XmlaPackage.TRACE_FILTER__LESS:
				return less != null;
			case XmlaPackage.TRACE_FILTER__LESS_OR_EQUAL:
				return lessOrEqual != null;
			case XmlaPackage.TRACE_FILTER__GREATER:
				return greater != null;
			case XmlaPackage.TRACE_FILTER__GREATER_OR_EQUAL:
				return greaterOrEqual != null;
			case XmlaPackage.TRACE_FILTER__LIKE:
				return like != null;
			case XmlaPackage.TRACE_FILTER__NOT_LIKE:
				return notLike != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceFilterImpl
