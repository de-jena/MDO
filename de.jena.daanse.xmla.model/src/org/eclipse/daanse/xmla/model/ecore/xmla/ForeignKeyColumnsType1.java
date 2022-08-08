/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Columns Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1#getForeignKeyColumn <em>Foreign Key Column</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getForeignKeyColumnsType1()
 * @model extendedMetaData="name='ForeignKeyColumns_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ForeignKeyColumnsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Column</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getForeignKeyColumnsType1_ForeignKeyColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForeignKeyColumn'"
	 * @generated
	 */
	EList<ForeignKeyColumnType> getForeignKeyColumn();

} // ForeignKeyColumnsType1
