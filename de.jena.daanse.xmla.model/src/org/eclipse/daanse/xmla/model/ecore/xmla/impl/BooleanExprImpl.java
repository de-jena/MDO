/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getLeaf <em>Leaf</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getAnd1 <em>And1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getOr1 <em>Or1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getNot1 <em>Not1</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BooleanExprImpl#getLeaf1 <em>Leaf1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExprImpl extends MinimalEObjectImpl.Container implements BooleanExpr {
	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr and;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr or;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected UnaryExpr not;

	/**
	 * The cached value of the '{@link #getLeaf() <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaf()
	 * @generated
	 * @ordered
	 */
	protected PredLeaf leaf;

	/**
	 * The cached value of the '{@link #getAnd1() <em>And1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd1()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr and1;

	/**
	 * The cached value of the '{@link #getOr1() <em>Or1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr1()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr or1;

	/**
	 * The cached value of the '{@link #getNot1() <em>Not1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot1()
	 * @generated
	 * @ordered
	 */
	protected UnaryExpr not1;

	/**
	 * The cached value of the '{@link #getLeaf1() <em>Leaf1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaf1()
	 * @generated
	 * @ordered
	 */
	protected PredLeaf leaf1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.BOOLEAN_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(BooleanExpr newAnd, NotificationChain msgs) {
		BooleanExpr oldAnd = and;
		and = newAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__AND, oldAnd, newAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(BooleanExpr newAnd) {
		if (newAnd != and) {
			NotificationChain msgs = null;
			if (and != null)
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__AND, newAnd, newAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(BooleanExpr newOr, NotificationChain msgs) {
		BooleanExpr oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__OR, oldOr, newOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(BooleanExpr newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__OR, newOr, newOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpr getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(UnaryExpr newNot, NotificationChain msgs) {
		UnaryExpr oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__NOT, oldNot, newNot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(UnaryExpr newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredLeaf getLeaf() {
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaf(PredLeaf newLeaf, NotificationChain msgs) {
		PredLeaf oldLeaf = leaf;
		leaf = newLeaf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__LEAF, oldLeaf, newLeaf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaf(PredLeaf newLeaf) {
		if (newLeaf != leaf) {
			NotificationChain msgs = null;
			if (leaf != null)
				msgs = ((InternalEObject)leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__LEAF, null, msgs);
			if (newLeaf != null)
				msgs = ((InternalEObject)newLeaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__LEAF, null, msgs);
			msgs = basicSetLeaf(newLeaf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__LEAF, newLeaf, newLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getAnd1() {
		return and1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd1(BooleanExpr newAnd1, NotificationChain msgs) {
		BooleanExpr oldAnd1 = and1;
		and1 = newAnd1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__AND1, oldAnd1, newAnd1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd1(BooleanExpr newAnd1) {
		if (newAnd1 != and1) {
			NotificationChain msgs = null;
			if (and1 != null)
				msgs = ((InternalEObject)and1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__AND1, null, msgs);
			if (newAnd1 != null)
				msgs = ((InternalEObject)newAnd1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__AND1, null, msgs);
			msgs = basicSetAnd1(newAnd1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__AND1, newAnd1, newAnd1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getOr1() {
		return or1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr1(BooleanExpr newOr1, NotificationChain msgs) {
		BooleanExpr oldOr1 = or1;
		or1 = newOr1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__OR1, oldOr1, newOr1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr1(BooleanExpr newOr1) {
		if (newOr1 != or1) {
			NotificationChain msgs = null;
			if (or1 != null)
				msgs = ((InternalEObject)or1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__OR1, null, msgs);
			if (newOr1 != null)
				msgs = ((InternalEObject)newOr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__OR1, null, msgs);
			msgs = basicSetOr1(newOr1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__OR1, newOr1, newOr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpr getNot1() {
		return not1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot1(UnaryExpr newNot1, NotificationChain msgs) {
		UnaryExpr oldNot1 = not1;
		not1 = newNot1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__NOT1, oldNot1, newNot1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot1(UnaryExpr newNot1) {
		if (newNot1 != not1) {
			NotificationChain msgs = null;
			if (not1 != null)
				msgs = ((InternalEObject)not1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__NOT1, null, msgs);
			if (newNot1 != null)
				msgs = ((InternalEObject)newNot1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__NOT1, null, msgs);
			msgs = basicSetNot1(newNot1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__NOT1, newNot1, newNot1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredLeaf getLeaf1() {
		return leaf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaf1(PredLeaf newLeaf1, NotificationChain msgs) {
		PredLeaf oldLeaf1 = leaf1;
		leaf1 = newLeaf1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__LEAF1, oldLeaf1, newLeaf1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaf1(PredLeaf newLeaf1) {
		if (newLeaf1 != leaf1) {
			NotificationChain msgs = null;
			if (leaf1 != null)
				msgs = ((InternalEObject)leaf1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__LEAF1, null, msgs);
			if (newLeaf1 != null)
				msgs = ((InternalEObject)newLeaf1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BOOLEAN_EXPR__LEAF1, null, msgs);
			msgs = basicSetLeaf1(newLeaf1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BOOLEAN_EXPR__LEAF1, newLeaf1, newLeaf1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.BOOLEAN_EXPR__AND:
				return basicSetAnd(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__OR:
				return basicSetOr(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__NOT:
				return basicSetNot(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__LEAF:
				return basicSetLeaf(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__AND1:
				return basicSetAnd1(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__OR1:
				return basicSetOr1(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__NOT1:
				return basicSetNot1(null, msgs);
			case XmlaPackage.BOOLEAN_EXPR__LEAF1:
				return basicSetLeaf1(null, msgs);
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
			case XmlaPackage.BOOLEAN_EXPR__AND:
				return getAnd();
			case XmlaPackage.BOOLEAN_EXPR__OR:
				return getOr();
			case XmlaPackage.BOOLEAN_EXPR__NOT:
				return getNot();
			case XmlaPackage.BOOLEAN_EXPR__LEAF:
				return getLeaf();
			case XmlaPackage.BOOLEAN_EXPR__AND1:
				return getAnd1();
			case XmlaPackage.BOOLEAN_EXPR__OR1:
				return getOr1();
			case XmlaPackage.BOOLEAN_EXPR__NOT1:
				return getNot1();
			case XmlaPackage.BOOLEAN_EXPR__LEAF1:
				return getLeaf1();
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
			case XmlaPackage.BOOLEAN_EXPR__AND:
				setAnd((BooleanExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__OR:
				setOr((BooleanExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__NOT:
				setNot((UnaryExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__LEAF:
				setLeaf((PredLeaf)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__AND1:
				setAnd1((BooleanExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__OR1:
				setOr1((BooleanExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__NOT1:
				setNot1((UnaryExpr)newValue);
				return;
			case XmlaPackage.BOOLEAN_EXPR__LEAF1:
				setLeaf1((PredLeaf)newValue);
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
			case XmlaPackage.BOOLEAN_EXPR__AND:
				setAnd((BooleanExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__OR:
				setOr((BooleanExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__NOT:
				setNot((UnaryExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__LEAF:
				setLeaf((PredLeaf)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__AND1:
				setAnd1((BooleanExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__OR1:
				setOr1((BooleanExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__NOT1:
				setNot1((UnaryExpr)null);
				return;
			case XmlaPackage.BOOLEAN_EXPR__LEAF1:
				setLeaf1((PredLeaf)null);
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
			case XmlaPackage.BOOLEAN_EXPR__AND:
				return and != null;
			case XmlaPackage.BOOLEAN_EXPR__OR:
				return or != null;
			case XmlaPackage.BOOLEAN_EXPR__NOT:
				return not != null;
			case XmlaPackage.BOOLEAN_EXPR__LEAF:
				return leaf != null;
			case XmlaPackage.BOOLEAN_EXPR__AND1:
				return and1 != null;
			case XmlaPackage.BOOLEAN_EXPR__OR1:
				return or1 != null;
			case XmlaPackage.BOOLEAN_EXPR__NOT1:
				return not1 != null;
			case XmlaPackage.BOOLEAN_EXPR__LEAF1:
				return leaf1 != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanExprImpl
