/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Mining Structure Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getSourceMeasureGroup <em>Source Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableMiningStructureColumn()
 * @model extendedMetaData="name='TableMiningStructureColumn' kind='elementOnly'"
 * @generated
 */
public interface TableMiningStructureColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Columns</em>' containment reference.
	 * @see #setForeignKeyColumns(ForeignKeyColumnsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableMiningStructureColumn_ForeignKeyColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForeignKeyColumns'"
	 * @generated
	 */
	ForeignKeyColumnsType getForeignKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getForeignKeyColumns <em>Foreign Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Columns</em>' containment reference.
	 * @see #getForeignKeyColumns()
	 * @generated
	 */
	void setForeignKeyColumns(ForeignKeyColumnsType value);

	/**
	 * Returns the value of the '<em><b>Source Measure Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Measure Group</em>' containment reference.
	 * @see #setSourceMeasureGroup(MeasureGroupBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableMiningStructureColumn_SourceMeasureGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceMeasureGroup'"
	 * @generated
	 */
	MeasureGroupBinding getSourceMeasureGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getSourceMeasureGroup <em>Source Measure Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Measure Group</em>' containment reference.
	 * @see #getSourceMeasureGroup()
	 * @generated
	 */
	void setSourceMeasureGroup(MeasureGroupBinding value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(ColumnsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableMiningStructureColumn_Columns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Columns'"
	 * @generated
	 */
	ColumnsType1 getColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(ColumnsType1 value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableMiningStructureColumn_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

} // TableMiningStructureColumn
