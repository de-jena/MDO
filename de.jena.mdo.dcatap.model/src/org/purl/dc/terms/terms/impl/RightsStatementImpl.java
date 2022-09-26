/**
 */
package org.purl.dc.terms.terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.purl.dc.terms.terms.RightsStatement;
import org.purl.dc.terms.terms.RightsStatementType;
import org.purl.dc.terms.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rights Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.impl.RightsStatementImpl#getRightsStatement <em>Rights Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightsStatementImpl extends MinimalEObjectImpl.Container implements RightsStatement {
	/**
	 * The cached value of the '{@link #getRightsStatement() <em>Rights Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsStatement()
	 * @generated
	 * @ordered
	 */
	protected RightsStatementType rightsStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightsStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.RIGHTS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightsStatementType getRightsStatement() {
		return rightsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightsStatement(RightsStatementType newRightsStatement, NotificationChain msgs) {
		RightsStatementType oldRightsStatement = rightsStatement;
		rightsStatement = newRightsStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT, oldRightsStatement, newRightsStatement);
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
	public void setRightsStatement(RightsStatementType newRightsStatement) {
		if (newRightsStatement != rightsStatement) {
			NotificationChain msgs = null;
			if (rightsStatement != null)
				msgs = ((InternalEObject)rightsStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT, null, msgs);
			if (newRightsStatement != null)
				msgs = ((InternalEObject)newRightsStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT, null, msgs);
			msgs = basicSetRightsStatement(newRightsStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT, newRightsStatement, newRightsStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT:
				return basicSetRightsStatement(null, msgs);
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
			case TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT:
				return getRightsStatement();
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
			case TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT:
				setRightsStatement((RightsStatementType)newValue);
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
			case TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT:
				setRightsStatement((RightsStatementType)null);
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
			case TermsPackage.RIGHTS_STATEMENT__RIGHTS_STATEMENT:
				return rightsStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //RightsStatementImpl
