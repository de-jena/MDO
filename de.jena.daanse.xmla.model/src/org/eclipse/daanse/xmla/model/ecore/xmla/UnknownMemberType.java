/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValuens <em>Valuens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnknownMemberType()
 * @model extendedMetaData="name='UnknownMember_._type' kind='simple'"
 * @generated
 */
public interface UnknownMemberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(UnknownMemberEnumType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnknownMemberType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	UnknownMemberEnumType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberEnumType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UnknownMemberEnumType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(UnknownMemberEnumType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(UnknownMemberEnumType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Valuens</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #setValuens(ValuensType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getUnknownMemberType_Valuens()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valuens'"
	 * @generated
	 */
	ValuensType getValuens();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuens</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType
	 * @see #isSetValuens()
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @generated
	 */
	void setValuens(ValuensType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValuens <em>Valuens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType)
	 * @generated
	 */
	void unsetValuens();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType#getValuens <em>Valuens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuens</em>' attribute is set.
	 * @see #unsetValuens()
	 * @see #getValuens()
	 * @see #setValuens(ValuensType)
	 * @generated
	 */
	boolean isSetValuens();

} // UnknownMemberType
