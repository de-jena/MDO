/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folding Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.FoldingParametersImpl#getFoldIndex <em>Fold Index</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.FoldingParametersImpl#getFoldCount <em>Fold Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.FoldingParametersImpl#getFoldMaxCases <em>Fold Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.FoldingParametersImpl#getFoldTargetAttribute <em>Fold Target Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoldingParametersImpl extends MinimalEObjectImpl.Container implements FoldingParameters {
	/**
	 * The default value of the '{@link #getFoldIndex() <em>Fold Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FOLD_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoldIndex() <em>Fold Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger foldIndex = FOLD_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoldCount() <em>Fold Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FOLD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoldCount() <em>Fold Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger foldCount = FOLD_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoldMaxCases() <em>Fold Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldMaxCases()
	 * @generated
	 * @ordered
	 */
	protected static final long FOLD_MAX_CASES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFoldMaxCases() <em>Fold Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldMaxCases()
	 * @generated
	 * @ordered
	 */
	protected long foldMaxCases = FOLD_MAX_CASES_EDEFAULT;

	/**
	 * This is true if the Fold Max Cases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean foldMaxCasesESet;

	/**
	 * The default value of the '{@link #getFoldTargetAttribute() <em>Fold Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLD_TARGET_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoldTargetAttribute() <em>Fold Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected String foldTargetAttribute = FOLD_TARGET_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoldingParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.FOLDING_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFoldIndex() {
		return foldIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoldIndex(BigInteger newFoldIndex) {
		BigInteger oldFoldIndex = foldIndex;
		foldIndex = newFoldIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.FOLDING_PARAMETERS__FOLD_INDEX, oldFoldIndex, foldIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFoldCount() {
		return foldCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoldCount(BigInteger newFoldCount) {
		BigInteger oldFoldCount = foldCount;
		foldCount = newFoldCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.FOLDING_PARAMETERS__FOLD_COUNT, oldFoldCount, foldCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFoldMaxCases() {
		return foldMaxCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoldMaxCases(long newFoldMaxCases) {
		long oldFoldMaxCases = foldMaxCases;
		foldMaxCases = newFoldMaxCases;
		boolean oldFoldMaxCasesESet = foldMaxCasesESet;
		foldMaxCasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES, oldFoldMaxCases, foldMaxCases, !oldFoldMaxCasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFoldMaxCases() {
		long oldFoldMaxCases = foldMaxCases;
		boolean oldFoldMaxCasesESet = foldMaxCasesESet;
		foldMaxCases = FOLD_MAX_CASES_EDEFAULT;
		foldMaxCasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES, oldFoldMaxCases, FOLD_MAX_CASES_EDEFAULT, oldFoldMaxCasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFoldMaxCases() {
		return foldMaxCasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFoldTargetAttribute() {
		return foldTargetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoldTargetAttribute(String newFoldTargetAttribute) {
		String oldFoldTargetAttribute = foldTargetAttribute;
		foldTargetAttribute = newFoldTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.FOLDING_PARAMETERS__FOLD_TARGET_ATTRIBUTE, oldFoldTargetAttribute, foldTargetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_INDEX:
				return getFoldIndex();
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_COUNT:
				return getFoldCount();
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES:
				return getFoldMaxCases();
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_TARGET_ATTRIBUTE:
				return getFoldTargetAttribute();
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
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_INDEX:
				setFoldIndex((BigInteger)newValue);
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_COUNT:
				setFoldCount((BigInteger)newValue);
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES:
				setFoldMaxCases((Long)newValue);
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_TARGET_ATTRIBUTE:
				setFoldTargetAttribute((String)newValue);
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
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_INDEX:
				setFoldIndex(FOLD_INDEX_EDEFAULT);
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_COUNT:
				setFoldCount(FOLD_COUNT_EDEFAULT);
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES:
				unsetFoldMaxCases();
				return;
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_TARGET_ATTRIBUTE:
				setFoldTargetAttribute(FOLD_TARGET_ATTRIBUTE_EDEFAULT);
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
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_INDEX:
				return FOLD_INDEX_EDEFAULT == null ? foldIndex != null : !FOLD_INDEX_EDEFAULT.equals(foldIndex);
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_COUNT:
				return FOLD_COUNT_EDEFAULT == null ? foldCount != null : !FOLD_COUNT_EDEFAULT.equals(foldCount);
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_MAX_CASES:
				return isSetFoldMaxCases();
			case XmlaPackage.FOLDING_PARAMETERS__FOLD_TARGET_ATTRIBUTE:
				return FOLD_TARGET_ATTRIBUTE_EDEFAULT == null ? foldTargetAttribute != null : !FOLD_TARGET_ATTRIBUTE_EDEFAULT.equals(foldTargetAttribute);
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
		result.append(" (foldIndex: ");
		result.append(foldIndex);
		result.append(", foldCount: ");
		result.append(foldCount);
		result.append(", foldMaxCases: ");
		if (foldMaxCasesESet) result.append(foldMaxCases); else result.append("<unset>");
		result.append(", foldTargetAttribute: ");
		result.append(foldTargetAttribute);
		result.append(')');
		return result.toString();
	}

} //FoldingParametersImpl
