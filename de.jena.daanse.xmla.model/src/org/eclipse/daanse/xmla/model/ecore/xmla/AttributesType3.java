/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType3#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributesType3()
 * @model extendedMetaData="name='Attributes_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributesType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributesType3_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute'"
	 * @generated
	 */
	EList<AttributeInsertUpdate> getAttribute();

} // AttributesType3