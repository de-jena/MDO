/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Columns Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2#getKeyColumn <em>Key Column</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyColumnsType2()
 * @model extendedMetaData="name='KeyColumns_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface KeyColumnsType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Column</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyColumnsType2_KeyColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyColumn'"
	 * @generated
	 */
	EList<KeyColumnType> getKeyColumn();

} // KeyColumnsType2