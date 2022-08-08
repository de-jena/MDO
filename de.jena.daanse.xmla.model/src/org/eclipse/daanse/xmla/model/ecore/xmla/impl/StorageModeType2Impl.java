/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Mode Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.StorageModeType2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.StorageModeType2Impl#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageModeType2Impl extends MinimalEObjectImpl.Container implements StorageModeType2 {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final PartitionStorageModeEnumType VALUE_EDEFAULT = PartitionStorageModeEnumType.MOLAP;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PartitionStorageModeEnumType value = VALUE_EDEFAULT;

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
	protected static final ValuensType4 VALUENS_EDEFAULT = ValuensType4.HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200;

	/**
	 * The cached value of the '{@link #getValuens() <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuens()
	 * @generated
	 * @ordered
	 */
	protected ValuensType4 valuens = VALUENS_EDEFAULT;

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
	protected StorageModeType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.STORAGE_MODE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionStorageModeEnumType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(PartitionStorageModeEnumType newValue) {
		PartitionStorageModeEnumType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.STORAGE_MODE_TYPE2__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		PartitionStorageModeEnumType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.STORAGE_MODE_TYPE2__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public ValuensType4 getValuens() {
		return valuens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuens(ValuensType4 newValuens) {
		ValuensType4 oldValuens = valuens;
		valuens = newValuens == null ? VALUENS_EDEFAULT : newValuens;
		boolean oldValuensESet = valuensESet;
		valuensESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.STORAGE_MODE_TYPE2__VALUENS, oldValuens, valuens, !oldValuensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuens() {
		ValuensType4 oldValuens = valuens;
		boolean oldValuensESet = valuensESet;
		valuens = VALUENS_EDEFAULT;
		valuensESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.STORAGE_MODE_TYPE2__VALUENS, oldValuens, VALUENS_EDEFAULT, oldValuensESet));
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
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUE:
				return getValue();
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUENS:
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
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUE:
				setValue((PartitionStorageModeEnumType)newValue);
				return;
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUENS:
				setValuens((ValuensType4)newValue);
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
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUE:
				unsetValue();
				return;
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUENS:
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
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUE:
				return isSetValue();
			case XmlaPackage.STORAGE_MODE_TYPE2__VALUENS:
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

} //StorageModeType2Impl
