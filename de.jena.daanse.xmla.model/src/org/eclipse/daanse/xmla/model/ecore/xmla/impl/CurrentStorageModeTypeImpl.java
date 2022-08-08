/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionCurrentStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Storage Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CurrentStorageModeTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CurrentStorageModeTypeImpl#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentStorageModeTypeImpl extends MinimalEObjectImpl.Container implements CurrentStorageModeType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionCurrentStorageModeEnumType VALUE_EDEFAULT = DimensionCurrentStorageModeEnumType.MOLAP;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DimensionCurrentStorageModeEnumType value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getValuens() <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuens()
	 * @generated
	 * @ordered
	 */
	protected static final ValuensType3 VALUENS_EDEFAULT = ValuensType3.HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200;

	/**
	 * The cached value of the '{@link #getValuens() <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuens()
	 * @generated
	 * @ordered
	 */
	protected ValuensType3 valuens = VALUENS_EDEFAULT;

	/**
	 * This is true if the Valuens attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valuensESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentStorageModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CURRENT_STORAGE_MODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionCurrentStorageModeEnumType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DimensionCurrentStorageModeEnumType newValue) {
		DimensionCurrentStorageModeEnumType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		DimensionCurrentStorageModeEnumType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType3 getValuens() {
		return valuens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuens(ValuensType3 newValuens) {
		ValuensType3 oldValuens = valuens;
		valuens = newValuens == null ? VALUENS_EDEFAULT : newValuens;
		boolean oldValuensESet = valuensESet;
		valuensESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS, oldValuens, valuens, !oldValuensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuens() {
		ValuensType3 oldValuens = valuens;
		boolean oldValuensESet = valuensESet;
		valuens = VALUENS_EDEFAULT;
		valuensESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS, oldValuens, VALUENS_EDEFAULT, oldValuensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValuens() {
		return valuensESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE:
				return getValue();
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS:
				return getValuens();
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
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE:
				setValue((DimensionCurrentStorageModeEnumType)newValue);
				return;
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS:
				setValuens((ValuensType3)newValue);
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
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE:
				unsetValue();
				return;
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS:
				unsetValuens();
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
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUE:
				return isSetValue();
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE__VALUENS:
				return isSetValuens();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", valuens: ");
		if (valuensESet) result.append(valuens); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CurrentStorageModeTypeImpl
