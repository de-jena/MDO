/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttributeTypeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TypeType6Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TypeType6Impl#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeType6Impl extends MinimalEObjectImpl.Container implements TypeType6 {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionAttributeTypeEnumType VALUE_EDEFAULT = DimensionAttributeTypeEnumType.ACCOUNT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DimensionAttributeTypeEnumType value = VALUE_EDEFAULT;

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
	protected static final ValuensType5 VALUENS_EDEFAULT = ValuensType5.HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200;

	/**
	 * The cached value of the '{@link #getValuens() <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuens()
	 * @generated
	 * @ordered
	 */
	protected ValuensType5 valuens = VALUENS_EDEFAULT;

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
	protected TypeType6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TYPE_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttributeTypeEnumType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DimensionAttributeTypeEnumType newValue) {
		DimensionAttributeTypeEnumType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TYPE_TYPE6__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		DimensionAttributeTypeEnumType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TYPE_TYPE6__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public ValuensType5 getValuens() {
		return valuens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuens(ValuensType5 newValuens) {
		ValuensType5 oldValuens = valuens;
		valuens = newValuens == null ? VALUENS_EDEFAULT : newValuens;
		boolean oldValuensESet = valuensESet;
		valuensESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TYPE_TYPE6__VALUENS, oldValuens, valuens, !oldValuensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuens() {
		ValuensType5 oldValuens = valuens;
		boolean oldValuensESet = valuensESet;
		valuens = VALUENS_EDEFAULT;
		valuensESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TYPE_TYPE6__VALUENS, oldValuens, VALUENS_EDEFAULT, oldValuensESet));
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
			case XmlaPackage.TYPE_TYPE6__VALUE:
				return getValue();
			case XmlaPackage.TYPE_TYPE6__VALUENS:
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
			case XmlaPackage.TYPE_TYPE6__VALUE:
				setValue((DimensionAttributeTypeEnumType)newValue);
				return;
			case XmlaPackage.TYPE_TYPE6__VALUENS:
				setValuens((ValuensType5)newValue);
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
			case XmlaPackage.TYPE_TYPE6__VALUE:
				unsetValue();
				return;
			case XmlaPackage.TYPE_TYPE6__VALUENS:
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
			case XmlaPackage.TYPE_TYPE6__VALUE:
				return isSetValue();
			case XmlaPackage.TYPE_TYPE6__VALUENS:
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

} //TypeType6Impl
