/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Of Line Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMiningStructureID <em>Mining Structure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMeasureID <em>Measure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getParentColumnID <em>Parent Column ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getColumnID <em>Column ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getSkippedLevelsColumn <em>Skipped Levels Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCustomRollupColumn <em>Custom Rollup Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getUnaryOperatorColumn <em>Unary Operator Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding()
 * @model extendedMetaData="name='OutOfLineBinding' kind='elementOnly'"
 * @generated
 */
public interface OutOfLineBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' attribute.
	 * @see #setDatabaseID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_DatabaseID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	String getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getDatabaseID <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' attribute.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(String value);

	/**
	 * Returns the value of the '<em><b>Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension ID</em>' attribute.
	 * @see #setDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_DimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DimensionID'"
	 * @generated
	 */
	String getDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getDimensionID <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension ID</em>' attribute.
	 * @see #getDimensionID()
	 * @generated
	 */
	void setDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Cube ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube ID</em>' attribute.
	 * @see #setCubeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_CubeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CubeID'"
	 * @generated
	 */
	String getCubeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCubeID <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube ID</em>' attribute.
	 * @see #getCubeID()
	 * @generated
	 */
	void setCubeID(String value);

	/**
	 * Returns the value of the '<em><b>Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group ID</em>' attribute.
	 * @see #setMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_MeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MeasureGroupID'"
	 * @generated
	 */
	String getMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMeasureGroupID <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group ID</em>' attribute.
	 * @see #getMeasureGroupID()
	 * @generated
	 */
	void setMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Partition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition ID</em>' attribute.
	 * @see #setPartitionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_PartitionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PartitionID'"
	 * @generated
	 */
	String getPartitionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getPartitionID <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition ID</em>' attribute.
	 * @see #getPartitionID()
	 * @generated
	 */
	void setPartitionID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model ID</em>' attribute.
	 * @see #setMiningModelID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_MiningModelID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningModelID'"
	 * @generated
	 */
	String getMiningModelID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMiningModelID <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model ID</em>' attribute.
	 * @see #getMiningModelID()
	 * @generated
	 */
	void setMiningModelID(String value);

	/**
	 * Returns the value of the '<em><b>Mining Structure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure ID</em>' attribute.
	 * @see #setMiningStructureID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_MiningStructureID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningStructureID'"
	 * @generated
	 */
	String getMiningStructureID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMiningStructureID <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structure ID</em>' attribute.
	 * @see #getMiningStructureID()
	 * @generated
	 */
	void setMiningStructureID(String value);

	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #getCubeDimensionID()
	 * @generated
	 */
	void setCubeDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Measure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure ID</em>' attribute.
	 * @see #setMeasureID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_MeasureID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MeasureID'"
	 * @generated
	 */
	String getMeasureID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getMeasureID <em>Measure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure ID</em>' attribute.
	 * @see #getMeasureID()
	 * @generated
	 */
	void setMeasureID(String value);

	/**
	 * Returns the value of the '<em><b>Parent Column ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Column ID</em>' attribute.
	 * @see #setParentColumnID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_ParentColumnID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ParentColumnID'"
	 * @generated
	 */
	String getParentColumnID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getParentColumnID <em>Parent Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Column ID</em>' attribute.
	 * @see #getParentColumnID()
	 * @generated
	 */
	void setParentColumnID(String value);

	/**
	 * Returns the value of the '<em><b>Column ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column ID</em>' attribute.
	 * @see #setColumnID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_ColumnID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ColumnID'"
	 * @generated
	 */
	String getColumnID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getColumnID <em>Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column ID</em>' attribute.
	 * @see #getColumnID()
	 * @generated
	 */
	void setColumnID(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Name Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Column</em>' containment reference.
	 * @see #setNameColumn(NameColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_NameColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameColumn'"
	 * @generated
	 */
	NameColumnType getNameColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getNameColumn <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Column</em>' containment reference.
	 * @see #getNameColumn()
	 * @generated
	 */
	void setNameColumn(NameColumnType value);

	/**
	 * Returns the value of the '<em><b>Skipped Levels Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skipped Levels Column</em>' containment reference.
	 * @see #setSkippedLevelsColumn(SkippedLevelsColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_SkippedLevelsColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SkippedLevelsColumn'"
	 * @generated
	 */
	SkippedLevelsColumnType getSkippedLevelsColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getSkippedLevelsColumn <em>Skipped Levels Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skipped Levels Column</em>' containment reference.
	 * @see #getSkippedLevelsColumn()
	 * @generated
	 */
	void setSkippedLevelsColumn(SkippedLevelsColumnType value);

	/**
	 * Returns the value of the '<em><b>Custom Rollup Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Rollup Column</em>' containment reference.
	 * @see #setCustomRollupColumn(CustomRollupColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_CustomRollupColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomRollupColumn'"
	 * @generated
	 */
	CustomRollupColumnType getCustomRollupColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCustomRollupColumn <em>Custom Rollup Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Rollup Column</em>' containment reference.
	 * @see #getCustomRollupColumn()
	 * @generated
	 */
	void setCustomRollupColumn(CustomRollupColumnType value);

	/**
	 * Returns the value of the '<em><b>Custom Rollup Properties Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Rollup Properties Column</em>' containment reference.
	 * @see #setCustomRollupPropertiesColumn(CustomRollupPropertiesColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_CustomRollupPropertiesColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomRollupPropertiesColumn'"
	 * @generated
	 */
	CustomRollupPropertiesColumnType getCustomRollupPropertiesColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Rollup Properties Column</em>' containment reference.
	 * @see #getCustomRollupPropertiesColumn()
	 * @generated
	 */
	void setCustomRollupPropertiesColumn(CustomRollupPropertiesColumnType value);

	/**
	 * Returns the value of the '<em><b>Value Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Column</em>' containment reference.
	 * @see #setValueColumn(ValueColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_ValueColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueColumn'"
	 * @generated
	 */
	ValueColumnType getValueColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getValueColumn <em>Value Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Column</em>' containment reference.
	 * @see #getValueColumn()
	 * @generated
	 */
	void setValueColumn(ValueColumnType value);

	/**
	 * Returns the value of the '<em><b>Unary Operator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator Column</em>' containment reference.
	 * @see #setUnaryOperatorColumn(UnaryOperatorColumnType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_UnaryOperatorColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnaryOperatorColumn'"
	 * @generated
	 */
	UnaryOperatorColumnType getUnaryOperatorColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getUnaryOperatorColumn <em>Unary Operator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator Column</em>' containment reference.
	 * @see #getUnaryOperatorColumn()
	 * @generated
	 */
	void setUnaryOperatorColumn(UnaryOperatorColumnType value);

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference.
	 * @see #setKeyColumns(KeyColumnsType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_KeyColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyColumns'"
	 * @generated
	 */
	KeyColumnsType2 getKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getKeyColumns <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Columns</em>' containment reference.
	 * @see #getKeyColumns()
	 * @generated
	 */
	void setKeyColumns(KeyColumnsType2 value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Columns</em>' containment reference.
	 * @see #setForeignKeyColumns(ForeignKeyColumnsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_ForeignKeyColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForeignKeyColumns'"
	 * @generated
	 */
	ForeignKeyColumnsType1 getForeignKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getForeignKeyColumns <em>Foreign Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Columns</em>' containment reference.
	 * @see #getForeignKeyColumns()
	 * @generated
	 */
	void setForeignKeyColumns(ForeignKeyColumnsType1 value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getOutOfLineBinding_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

} // OutOfLineBinding
