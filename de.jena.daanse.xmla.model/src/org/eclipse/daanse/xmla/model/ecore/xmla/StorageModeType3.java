/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Mode Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType3()
 * @model extendedMetaData="name='StorageMode_._3_._type' kind='simple'"
 * @generated
 */
public interface StorageModeType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupStorageModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupStorageModeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(MeasureGroupStorageModeEnumType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType3_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	MeasureGroupStorageModeEnumType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupStorageModeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MeasureGroupStorageModeEnumType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(MeasureGroupStorageModeEnumType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(MeasureGroupStorageModeEnumType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Valuens</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType6
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #setValuens(ValuensType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType3_Valuens()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valuens'"
	 * @generated
	 */
	ValuensType6 getValuens();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType6
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @generated
	 */
	void setValuens(ValuensType6 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType6)
	 * @generated
	 */
	void unsetValuens();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3#getValuens <em>Valuens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuens</em>' attribute is set.
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType6)
	 * @generated
	 */
	boolean isSetValuens();

} // StorageModeType3
