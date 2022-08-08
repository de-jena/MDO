/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OrdinalType#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOrdinalType()
 * @model extendedMetaData="name='Ordinal_._type' kind='elementOnly'"
 * @generated
 */
public interface OrdinalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOrdinalType_Ordinal()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Ordinal'"
	 * @generated
	 */
	EList<BigInteger> getOrdinal();

} // OrdinalType
