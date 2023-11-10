/*
 */
package terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import terms.ProvenanceStatement;
import terms.ProvenanceStatementType;
import terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.ProvenanceStatementImpl#getProvenanceStatement <em>Provenance Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceStatementImpl extends MinimalEObjectImpl.Container implements ProvenanceStatement {
	/**
	 * The cached value of the '{@link #getProvenanceStatement() <em>Provenance Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenanceStatement()
	 * @generated
	 * @ordered
	 */
	protected ProvenanceStatementType provenanceStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PROVENANCE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceStatementType getProvenanceStatement() {
		return provenanceStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenanceStatement(ProvenanceStatementType newProvenanceStatement, NotificationChain msgs) {
		ProvenanceStatementType oldProvenanceStatement = provenanceStatement;
		provenanceStatement = newProvenanceStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT, oldProvenanceStatement, newProvenanceStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenanceStatement(ProvenanceStatementType newProvenanceStatement) {
		if (newProvenanceStatement != provenanceStatement) {
			NotificationChain msgs = null;
			if (provenanceStatement != null)
				msgs = ((InternalEObject)provenanceStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT, null, msgs);
			if (newProvenanceStatement != null)
				msgs = ((InternalEObject)newProvenanceStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT, null, msgs);
			msgs = basicSetProvenanceStatement(newProvenanceStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT, newProvenanceStatement, newProvenanceStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT:
				return basicSetProvenanceStatement(null, msgs);
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
			case TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT:
				return getProvenanceStatement();
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
			case TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT:
				setProvenanceStatement((ProvenanceStatementType)newValue);
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
			case TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT:
				setProvenanceStatement((ProvenanceStatementType)null);
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
			case TermsPackage.PROVENANCE_STATEMENT__PROVENANCE_STATEMENT:
				return provenanceStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceStatementImpl
