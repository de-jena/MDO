/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.DurabilityGuaranteeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CommitTransactionImpl#getDurabilityGuarantee <em>Durability Guarantee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitTransactionImpl extends MinimalEObjectImpl.Container implements CommitTransaction {
	/**
	 * The default value of the '{@link #getDurabilityGuarantee() <em>Durability Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilityGuarantee()
	 * @generated
	 * @ordered
	 */
	protected static final DurabilityGuaranteeType DURABILITY_GUARANTEE_EDEFAULT = DurabilityGuaranteeType.LOCAL_DISK;

	/**
	 * The cached value of the '{@link #getDurabilityGuarantee() <em>Durability Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurabilityGuarantee()
	 * @generated
	 * @ordered
	 */
	protected DurabilityGuaranteeType durabilityGuarantee = DURABILITY_GUARANTEE_EDEFAULT;

	/**
	 * This is true if the Durability Guarantee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durabilityGuaranteeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.COMMIT_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityGuaranteeType getDurabilityGuarantee() {
		return durabilityGuarantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurabilityGuarantee(DurabilityGuaranteeType newDurabilityGuarantee) {
		DurabilityGuaranteeType oldDurabilityGuarantee = durabilityGuarantee;
		durabilityGuarantee = newDurabilityGuarantee == null ? DURABILITY_GUARANTEE_EDEFAULT : newDurabilityGuarantee;
		boolean oldDurabilityGuaranteeESet = durabilityGuaranteeESet;
		durabilityGuaranteeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE, oldDurabilityGuarantee, durabilityGuarantee, !oldDurabilityGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurabilityGuarantee() {
		DurabilityGuaranteeType oldDurabilityGuarantee = durabilityGuarantee;
		boolean oldDurabilityGuaranteeESet = durabilityGuaranteeESet;
		durabilityGuarantee = DURABILITY_GUARANTEE_EDEFAULT;
		durabilityGuaranteeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE, oldDurabilityGuarantee, DURABILITY_GUARANTEE_EDEFAULT, oldDurabilityGuaranteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurabilityGuarantee() {
		return durabilityGuaranteeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE:
				return getDurabilityGuarantee();
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
			case XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE:
				setDurabilityGuarantee((DurabilityGuaranteeType)newValue);
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
			case XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE:
				unsetDurabilityGuarantee();
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
			case XmlaPackage.COMMIT_TRANSACTION__DURABILITY_GUARANTEE:
				return isSetDurabilityGuarantee();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (durabilityGuarantee: ");
		if (durabilityGuaranteeESet) result.append(durabilityGuarantee); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CommitTransactionImpl
