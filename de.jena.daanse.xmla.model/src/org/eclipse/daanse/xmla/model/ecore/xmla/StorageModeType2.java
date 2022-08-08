/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Mode Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType2()
 * @model extendedMetaData="name='StorageMode_._2_._type' kind='simple'"
 * @generated
 */
public interface StorageModeType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionStorageModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionStorageModeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(PartitionStorageModeEnumType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType2_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	PartitionStorageModeEnumType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionStorageModeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PartitionStorageModeEnumType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(PartitionStorageModeEnumType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(PartitionStorageModeEnumType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Valuens</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType4
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #setValuens(ValuensType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getStorageModeType2_Valuens()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valuens'"
	 * @generated
	 */
	ValuensType4 getValuens();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType4
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @generated
	 */
	void setValuens(ValuensType4 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType4)
	 * @generated
	 */
	void unsetValuens();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2#getValuens <em>Valuens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuens</em>' attribute is set.
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType4)
	 * @generated
	 */
	boolean isSetValuens();

} // StorageModeType2
