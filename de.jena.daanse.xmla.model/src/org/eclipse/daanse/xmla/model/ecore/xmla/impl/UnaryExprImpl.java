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
 * An implementation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UnaryExprImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UnaryExprImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UnaryExprImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UnaryExprImpl#getLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExprImpl extends MinimalEObjectImpl.Container implements UnaryExpr {
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
	 * The cached value of the '{@link #getLeaf() <em>Leaf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaf()
	 * @generated
	 * @ordered
	 */
	protected PredLeaf leaf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.UNARY_EXPR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__NOT, oldNot, newNot);
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
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__NOT, newNot, newNot));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__AND, oldAnd, newAnd);
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
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__AND, newAnd, newAnd));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__OR, oldOr, newOr);
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
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__OR, newOr, newOr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__LEAF, oldLeaf, newLeaf);
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
				msgs = ((InternalEObject)leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__LEAF, null, msgs);
			if (newLeaf != null)
				msgs = ((InternalEObject)newLeaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UNARY_EXPR__LEAF, null, msgs);
			msgs = basicSetLeaf(newLeaf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UNARY_EXPR__LEAF, newLeaf, newLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.UNARY_EXPR__NOT:
				return basicSetNot(null, msgs);
			case XmlaPackage.UNARY_EXPR__AND:
				return basicSetAnd(null, msgs);
			case XmlaPackage.UNARY_EXPR__OR:
				return basicSetOr(null, msgs);
			case XmlaPackage.UNARY_EXPR__LEAF:
				return basicSetLeaf(null, msgs);
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
			case XmlaPackage.UNARY_EXPR__NOT:
				return getNot();
			case XmlaPackage.UNARY_EXPR__AND:
				return getAnd();
			case XmlaPackage.UNARY_EXPR__OR:
				return getOr();
			case XmlaPackage.UNARY_EXPR__LEAF:
				return getLeaf();
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
			case XmlaPackage.UNARY_EXPR__NOT:
				setNot((UnaryExpr)newValue);
				return;
			case XmlaPackage.UNARY_EXPR__AND:
				setAnd((BooleanExpr)newValue);
				return;
			case XmlaPackage.UNARY_EXPR__OR:
				setOr((BooleanExpr)newValue);
				return;
			case XmlaPackage.UNARY_EXPR__LEAF:
				setLeaf((PredLeaf)newValue);
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
			case XmlaPackage.UNARY_EXPR__NOT:
				setNot((UnaryExpr)null);
				return;
			case XmlaPackage.UNARY_EXPR__AND:
				setAnd((BooleanExpr)null);
				return;
			case XmlaPackage.UNARY_EXPR__OR:
				setOr((BooleanExpr)null);
				return;
			case XmlaPackage.UNARY_EXPR__LEAF:
				setLeaf((PredLeaf)null);
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
			case XmlaPackage.UNARY_EXPR__NOT:
				return not != null;
			case XmlaPackage.UNARY_EXPR__AND:
				return and != null;
			case XmlaPackage.UNARY_EXPR__OR:
				return or != null;
			case XmlaPackage.UNARY_EXPR__LEAF:
				return leaf != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryExprImpl
