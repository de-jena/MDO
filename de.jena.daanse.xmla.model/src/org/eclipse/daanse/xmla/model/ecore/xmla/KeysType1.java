/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.lang.Object;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keys Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeysType1#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeysType1()
 * @model extendedMetaData="name='Keys_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface KeysType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeysType1_Key()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='Key'"
	 * @generated
	 */
	EList<Object> getKey();

} // KeysType1
