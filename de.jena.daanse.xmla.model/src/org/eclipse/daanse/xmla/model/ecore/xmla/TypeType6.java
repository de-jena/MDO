/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTypeType6()
 * @model extendedMetaData="name='Type_._6_._type' kind='simple'"
 * @generated
 */
public interface TypeType6 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttributeTypeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttributeTypeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DimensionAttributeTypeEnumType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTypeType6_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	DimensionAttributeTypeEnumType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttributeTypeEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DimensionAttributeTypeEnumType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DimensionAttributeTypeEnumType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DimensionAttributeTypeEnumType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Valuens</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType5
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #setValuens(ValuensType5)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTypeType6_Valuens()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valuens'"
	 * @generated
	 */
	ValuensType5 getValuens();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType5
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @generated
	 */
	void setValuens(ValuensType5 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType5)
	 * @generated
	 */
	void unsetValuens();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6#getValuens <em>Valuens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuens</em>' attribute is set.
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType5)
	 * @generated
	 */
	boolean isSetValuens();

} // TypeType6
