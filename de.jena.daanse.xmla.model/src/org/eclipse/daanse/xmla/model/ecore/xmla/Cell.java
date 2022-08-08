/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.lang.Object;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getCellOrdinal <em>Cell Ordinal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCell()
 * @model extendedMetaData="name='Cell' kind='elementOnly'"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCell_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='Value'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Cell Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Ordinal</em>' attribute.
	 * @see #isSetCellOrdinal()
	 * @see #unsetCellOrdinal()
	 * @see #setCellOrdinal(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCell_CellOrdinal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='CellOrdinal'"
	 * @generated
	 */
	long getCellOrdinal();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getCellOrdinal <em>Cell Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Ordinal</em>' attribute.
	 * @see #isSetCellOrdinal()
	 * @see #unsetCellOrdinal()
	 * @see #getCellOrdinal()
	 * @generated
	 */
	void setCellOrdinal(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getCellOrdinal <em>Cell Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCellOrdinal()
	 * @see #getCellOrdinal()
	 * @see #setCellOrdinal(long)
	 * @generated
	 */
	void unsetCellOrdinal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell#getCellOrdinal <em>Cell Ordinal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cell Ordinal</em>' attribute is set.
	 * @see #unsetCellOrdinal()
	 * @see #getCellOrdinal()
	 * @see #setCellOrdinal(long)
	 * @generated
	 */
	boolean isSetCellOrdinal();

} // Cell
