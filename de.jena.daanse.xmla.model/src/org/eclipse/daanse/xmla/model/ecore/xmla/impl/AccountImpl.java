/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Account;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationFunctionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AliasesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AccountImpl#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AccountImpl#getAggregationFunction <em>Aggregation Function</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AccountImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AccountImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected String accountType = ACCOUNT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationFunctionType AGGREGATION_FUNCTION_EDEFAULT = AggregationFunctionType.SUM;

	/**
	 * The cached value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected AggregationFunctionType aggregationFunction = AGGREGATION_FUNCTION_EDEFAULT;

	/**
	 * This is true if the Aggregation Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationFunctionESet;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected AliasesType aliases;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType6 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountType(String newAccountType) {
		String oldAccountType = accountType;
		accountType = newAccountType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__ACCOUNT_TYPE, oldAccountType, accountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunctionType getAggregationFunction() {
		return aggregationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationFunction(AggregationFunctionType newAggregationFunction) {
		AggregationFunctionType oldAggregationFunction = aggregationFunction;
		aggregationFunction = newAggregationFunction == null ? AGGREGATION_FUNCTION_EDEFAULT : newAggregationFunction;
		boolean oldAggregationFunctionESet = aggregationFunctionESet;
		aggregationFunctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION, oldAggregationFunction, aggregationFunction, !oldAggregationFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregationFunction() {
		AggregationFunctionType oldAggregationFunction = aggregationFunction;
		boolean oldAggregationFunctionESet = aggregationFunctionESet;
		aggregationFunction = AGGREGATION_FUNCTION_EDEFAULT;
		aggregationFunctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION, oldAggregationFunction, AGGREGATION_FUNCTION_EDEFAULT, oldAggregationFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregationFunction() {
		return aggregationFunctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasesType getAliases() {
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliases(AliasesType newAliases, NotificationChain msgs) {
		AliasesType oldAliases = aliases;
		aliases = newAliases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__ALIASES, oldAliases, newAliases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliases(AliasesType newAliases) {
		if (newAliases != aliases) {
			NotificationChain msgs = null;
			if (aliases != null)
				msgs = ((InternalEObject)aliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ACCOUNT__ALIASES, null, msgs);
			if (newAliases != null)
				msgs = ((InternalEObject)newAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ACCOUNT__ALIASES, null, msgs);
			msgs = basicSetAliases(newAliases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__ALIASES, newAliases, newAliases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType6 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType6 newAnnotations, NotificationChain msgs) {
		AnnotationsType6 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType6 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ACCOUNT__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ACCOUNT__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ACCOUNT__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ACCOUNT__ALIASES:
				return basicSetAliases(null, msgs);
			case XmlaPackage.ACCOUNT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case XmlaPackage.ACCOUNT__ACCOUNT_TYPE:
				return getAccountType();
			case XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION:
				return getAggregationFunction();
			case XmlaPackage.ACCOUNT__ALIASES:
				return getAliases();
			case XmlaPackage.ACCOUNT__ANNOTATIONS:
				return getAnnotations();
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
			case XmlaPackage.ACCOUNT__ACCOUNT_TYPE:
				setAccountType((String)newValue);
				return;
			case XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION:
				setAggregationFunction((AggregationFunctionType)newValue);
				return;
			case XmlaPackage.ACCOUNT__ALIASES:
				setAliases((AliasesType)newValue);
				return;
			case XmlaPackage.ACCOUNT__ANNOTATIONS:
				setAnnotations((AnnotationsType6)newValue);
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
			case XmlaPackage.ACCOUNT__ACCOUNT_TYPE:
				setAccountType(ACCOUNT_TYPE_EDEFAULT);
				return;
			case XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION:
				unsetAggregationFunction();
				return;
			case XmlaPackage.ACCOUNT__ALIASES:
				setAliases((AliasesType)null);
				return;
			case XmlaPackage.ACCOUNT__ANNOTATIONS:
				setAnnotations((AnnotationsType6)null);
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
			case XmlaPackage.ACCOUNT__ACCOUNT_TYPE:
				return ACCOUNT_TYPE_EDEFAULT == null ? accountType != null : !ACCOUNT_TYPE_EDEFAULT.equals(accountType);
			case XmlaPackage.ACCOUNT__AGGREGATION_FUNCTION:
				return isSetAggregationFunction();
			case XmlaPackage.ACCOUNT__ALIASES:
				return aliases != null;
			case XmlaPackage.ACCOUNT__ANNOTATIONS:
				return annotations != null;
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
		result.append(" (accountType: ");
		result.append(accountType);
		result.append(", aggregationFunction: ");
		if (aggregationFunctionESet) result.append(aggregationFunction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AccountImpl
