/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCell <em>Cell</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCellSet <em>Cell Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getCellData()
 * @model extendedMetaData="name='CellData' kind='elementOnly'"
 * @generated
 */
public interface CellData extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getCellData_Cell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cell'"
	 * @generated
	 */
	EList<CellType> getCell();

	/**
	 * Returns the value of the '<em><b>Cell Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Set</em>' containment reference.
	 * @see #setCellSet(CellSetType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#getCellData_CellSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CellSet'"
	 * @generated
	 */
	CellSetType getCellSet();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCellSet <em>Cell Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Set</em>' containment reference.
	 * @see #getCellSet()
	 * @generated
	 */
	void setCellSet(CellSetType value);

} // CellData
