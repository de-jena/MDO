/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Columns Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType3#getKeyColumn <em>Key Column</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyColumnsType3()
 * @model extendedMetaData="name='KeyColumns_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface KeyColumnsType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Column</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyColumnsType3_KeyColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyColumn'"
	 * @generated
	 */
	EList<DataItem> getKeyColumn();

} // KeyColumnsType3